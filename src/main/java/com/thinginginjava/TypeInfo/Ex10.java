package com.thinginginjava.TypeInfo;

// typeinfo/Ex10.java
// TIJ4 Chapter Typeinfo, Exercise 10, page 318
// 写一个程序，使它能判断char数组究竟是个基本类型，还是一个对象。
public class Ex10 {

  public static void main(String[] args){
    char[] c = new char[10];
    System.out.println( "Superclass of char[] c:" + c.getClass().getSuperclass());
    System.out.println(" char[] c instanceof Object:" + c instanceof Object);
  }

}
