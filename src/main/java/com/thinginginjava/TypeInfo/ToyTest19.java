package com.thinginginjava.TypeInfo;

import java.lang.reflect.InvocationTargetException;

// typeinfo/ToyTest19.java
// TIJ4 Chapter Typeinfo, Exercise 19, page 337
// 在ToyTest.java中，使用反射机制，通过非默认构造器创建Toy对象。
public class ToyTest19 {

  public static void main(String[] args){
    try {
      Toy.class.getDeclaredConstructor(int.class).newInstance(1);
    } catch (InstantiationException e) {
      System.out.println("Unable make Toy: " + e);
    } catch (IllegalAccessException e) {
      System.out.println("Unable access: " + e);
    } catch (InvocationTargetException e) {
      System.out.println("Target invocation problem: " + e);
    } catch (NoSuchMethodException e) {
      System.out.println("No such method: " + e);
    }
  }

}
