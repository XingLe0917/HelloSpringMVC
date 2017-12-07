package com.thinginginjava.TypeInfo;
//TypeInfo.ToyTest1.java
// TIJ4 Chapter Typeinfo, Exercise 1, page 318
// 在ToyTest.java中，将Toy默认的构造器注释掉，并解释发生的现象。

/**
 * Created by xingle on 2017/12/7
 */
public class ToyTest1 {
  static void printInfo(Class c){
    System.out.println("Class name:"+c.getName()+" is interface ?" +c.isInterface() );
    System.out.println("Simple name:"+c.getSimpleName());
    System.out.println("Canonical name:"+c.getCanonicalName());
  }

  public static void main(String[] args){
    Class c = null;
    try {
      c = Class.forName("com.thinginginjava.TypeInfo.FancyToy1");
    } catch (ClassNotFoundException e) {
      System.out.println("Can't find FancyToy1");
      System.exit(1);
    }
    printInfo(c);
    for(Class face : c.getInterfaces()){
      printInfo(face);
    }
    Class up = c.getSuperclass();
    Object obj = null;
    try {
      // Requires default constructor in order to
      // create a super or Toy object:
      obj = up.newInstance();
    } catch (InstantiationException e) {
      System.out.println("Cannot instatiate 不能实例化");
    } catch (IllegalAccessException e) {
      System.out.println("Cannot access");
    }
    System.out.println("--------------------------------");
    printInfo(obj.getClass());
  }
}

class Toy1{
  // With default constructor commented out will be
  // unable to instantiate this Toy, super of FancyToy:
//  Toy1(){ }
  Toy1(int i){}
}

interface HasBatteries1{}
interface Waterproof1{}
interface Shoots1{}

class FancyToy1 extends Toy1 implements HasBatteries1,Waterproof1,Shoots1{
  FancyToy1(){super(1);}
}