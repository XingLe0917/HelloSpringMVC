package com.thinginginjava.TypeInfo;

// typeinfo/Ex8.java
// TIJ4 Chapter Typeinfo, Exercise 8, page 318
// 写一个方法，令它接受任意对象作为参数。
// 注意你是如何通过命令行参数来控制加载哪个Class对象的。
public class Ex8 {
  public static void Hierarchy(Object o){
    if(o.getClass().getSuperclass() != null){
      System.out.println(o.getClass() +" is a subclass of " + o.getClass().getSuperclass());
      try {
        Hierarchy(o.getClass().getSuperclass().newInstance());
      } catch (InstantiationException e) {
        System.out.println("Unable to instantiate obj");
      } catch (IllegalAccessException e) {
        System.out.println("Unable to access");
      }
    }
  }

  public static void main(String[] args){
    Hierarchy(new C());
  }

}


class A {}

class B extends A {}

class C extends B {}