package com.thinginginjava.TypeInfo;

import java.util.Random;

/**
 * Created by xingle on 2017/12/12
 */
public class ClassInitialization {
  public static Random rand = new Random(47);
  public static void main(String[] args) throws ClassNotFoundException {
    Class initable = Initable.class;//仅使用.class来获取类的引用不会引发初始化
    System.out.println("After creating Initable ref");
    System.out.println(Initable.staticFinal);//static final修饰的值是 编译期常量，不需要初始化类也可以访问
    System.out.println(Initable.staticFinal2);
    System.out.println(Initable2.staticNonfinal);//不是编译期常量，对 staticNonfinal 的访问将强制进行类的初始化
    Class initable3 = Class.forName("com.thinginginjava.TypeInfo.Initable3");//Class.forName 会立即进行初始化
    System.out.println("After creating Initable3 ref");
    System.out.println(Initable3.staticNonFianl);
  }

}


class Initable{
  static final int staticFinal = 47;
  static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);
  static {
    System.out.println("Initializing Initable");
  }
}

class Initable2{
  static int staticNonfinal = 147;
  static {
    System.out.println("Initializing Initable2");
  }
}

class Initable3{
  static int staticNonFianl = 74;
  static {
    System.out.println("Initializing Initable3");
  }
}