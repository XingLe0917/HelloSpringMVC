package com.thinginginjava.TypeInfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

// typeinfo/SimpleDynamicProxy22.java
// TIJ4 Chapter Typeinfo, Exercise 22, page 340
// 修改 SimpleDynamicProxy.java 使其可以度量方法调用的次数
public class SimpleDynamicProxy22 {

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
    Interface proxy = (Interface) Proxy
        .newProxyInstance(Interface.class.getClassLoader(), new Class[]{Interface.class},
            new DynamicProxyHandler1(real));
    consumer(proxy);
  }
}


class DynamicProxyHandler1 implements InvocationHandler{

  private Object proxied;
  public DynamicProxyHandler1(Object proxied){
    this.proxied = proxied;
  }

  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    long timeIn = new Date().getTime();
    System.out.println(
        "**** proxy: " + proxy.getClass() + "  ,method: " + method + "  ,args: " + args + ",timeIn"
            + timeIn +" on "+new Date());
    if(args!=null){
      for (Object arg : args) {
        System.out.println(" "+arg);
      }
    }
    long timeOut = new Date().getTime();
    System.out.println("Method call-return time: " + (timeOut - timeIn) + " msecs");
    return method.invoke(proxied,args);
  }
}