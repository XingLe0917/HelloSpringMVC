package com.thinginginjava.TypeInfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 14.7 动态代理 利用代理来过滤某些方法的调用
 */
public class SelectingMethods {

  public static void main(String[] args) {
    //Proxy.newProxyInstance()可以创建动态代理，
    // 该方法需要得到一个类加载器（通常可以从已经被加载的对象中获取其加载器，然后传递给它），
    // 一个你希望该代理实现的接口列表，
    // 以及InvocationHandler接口的一个实现。
    SomeMethods proxy = (SomeMethods) Proxy
        .newProxyInstance(SomeMethods.class.getClassLoader(), new Class[]{SomeMethods.class},
            new MethodsSelector(new Implementation()));
    proxy.boring1();
    proxy.boring2();
    proxy.interesting("bonobo");
    proxy.boring3();
  }
}

class MethodsSelector implements InvocationHandler {
  private Object proxied;

  public MethodsSelector(Object proxied) {
    this.proxied = proxied;
  }
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    if (method.getName().equals("interesting")) {
      System.out.println("Proxy detected the interesting method.");
    }
    return method.invoke(proxied, args);
  }
}

interface SomeMethods {
  void boring1();
  void boring2();
  void interesting(String arg);
  void boring3();
}

class Implementation implements SomeMethods {
  public void boring1() { System.out.println("boring1");}
  public void boring2() { System.out.println("boring2"); }
  public void interesting(String arg) { System.out.println("interesting " + arg); }
  public void boring3() { System.out.println("boring3"); }
}
