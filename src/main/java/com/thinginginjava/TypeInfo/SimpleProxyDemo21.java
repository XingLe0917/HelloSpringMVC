package com.thinginginjava.TypeInfo;

import java.util.Date;

// typeinfo/SimpleProxyDemo21.java
// TIJ4 Chapter Typeinfo, Exercise 21, page 340
// 修改SimpleProxyDemo.java ，使其可以度量方法调用的次数。
public class SimpleProxyDemo21 {
  public static void consumer(Interface iface){
    iface.doSomething();
    iface.somethingElse("booooo");
  }

  public static void main(String[] args){
    consumer(new RealObject());
    System.out.println("------------------------------------------------");
    consumer(new SimpleProxy1(new RealObject()));
    consumer(new SimpleProxy1(new RealObject()));
    consumer(new SimpleProxy1(new RealObject()));
  }

}


class SimpleProxy1 implements Interface{

  private Interface proxied;
  private static int doCount = 0;
  private static int sECount = 0;

  public SimpleProxy1(Interface proxied){
    this.proxied = proxied;
  }

  public void doSomething() {
    long timeIn = new Date().getTime();
    System.out.println("Time called doSomething() " + doCount + ": " + timeIn + " msecs");
    System.out.println("on " + new Date());
    doCount++;
    proxied.doSomething();
    System.out.println("Call-return time = " + ((new Date().getTime()) - timeIn) + " msecs");
  }

  public void somethingElse(String arg) {
    long timeIn = new Date().getTime();
    System.out.println("Time called somethingElse() " + sECount + ": " + timeIn + " msecs");
    System.out.println("on " + new Date());
    sECount++;
    proxied.somethingElse(arg);
    System.out.println("Call-return time = " + ((new Date().getTime()) - timeIn) + " msecs");

  }
}