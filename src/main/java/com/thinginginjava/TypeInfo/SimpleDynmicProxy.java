package com.thinginginjava.TypeInfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 14.7 动态代理
 * 动态代理重写SimpleProxyDemo.java示例
 */
public class SimpleDynmicProxy {
  public static void consumer(Interface iface){
    iface.doSomething();
    iface.somethingElse("bonobo");
  }

  public static void main(String[] args){
    RealObject real = new RealObject();
    consumer(real);
    System.out.println("-------------------");
    //Proxy.newProxyInstance()可以创建动态代理，
    // 该方法需要得到一个类加载器（通常可以从已经被加载的对象中获取其加载器，然后传递给它），
    // 一个你希望该代理实现的接口列表，
    // 以及InvocationHandler接口的一个实现。
    Interface proxy = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(),new Class[]{Interface.class},new DynamicProxyHandler(real));
    consumer(proxy);
  }

}

class DynamicProxyHandler implements InvocationHandler{

  private Object proxied;

  public DynamicProxyHandler(Object proxied){
    this.proxied = proxied;
  }

  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println("**** proxy: " + proxy.getClass()+"  ,method: "+method +"  ,args: "+args);
    if(args!=null){
      for (Object arg : args) {
        System.out.println(" "+arg);
      }
    }
    // 使用Method.invoke() 将请求转发给被代理对象，并传入必需的参数。
    return method.invoke(proxied,args);
  }
}
