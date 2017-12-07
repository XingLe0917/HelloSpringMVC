package com.thinginginjava.TypeInfo;
//TypeInfo/ToyTest2.java
// TIJ4 Chapter Typeinfo, Exercise 1, page 318

/* 将新的interface加入到ToyTest.java中，
  看看这个程序是否能够正确检测出来并加以显示。
*/
public class ToyTest2 {
  static void printInfo(Class c){
    System.out.println("Class name:"+c.getName()+" is interface ?" +c.isInterface() );
    System.out.println("Simple name:"+c.getSimpleName());
    System.out.println("Canonical name:"+c.getCanonicalName());
  }

  public static void main(String[] args){
    Class c = null;
    try {
      c = Class.forName("com.thinginginjava.TypeInfo.FancyToy2");
    } catch (ClassNotFoundException e) {
      System.out.println("Can't find FancyToy");
      System.exit(1);
    }
    printInfo(c);
    for(Class face : c.getInterfaces()){
      printInfo(face);
    }
    Class up = c.getSuperclass();
    Object obj = null;
    try {
      //需要默认的构造器
      obj = up.newInstance();
    } catch (InstantiationException e) {
      System.out.println("Cannot instatiate");
    } catch (IllegalAccessException e) {
      System.out.println("Cannot access");
    }
    System.out.println("--------------------------------");
    printInfo(obj.getClass());
  }
}

class Toy2{
  Toy2(){ }
  Toy2(int i){}
}

interface HasBatteries2{}
interface Waterproof2{}
interface Shoots2{}
interface Flies {} //加入的新接口

class FancyToy2 extends Toy implements HasBatteries2,Waterproof2,Shoots2,Flies{
  FancyToy2(){super(1);}
}
