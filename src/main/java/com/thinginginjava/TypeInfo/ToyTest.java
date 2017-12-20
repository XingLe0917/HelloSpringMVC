package com.thinginginjava.TypeInfo;

/**
 * Created by xingle on 2017/12/6
 */
public class ToyTest {
  static void printInfo(Class c){
    System.out.println("Class name:"+c.getName()+" is interface ?" +c.isInterface() );
    System.out.println("Simple name:"+c.getSimpleName());
    System.out.println("Canonical name:"+c.getCanonicalName());
  }

  public static void main(String[] args){
    Class c = null;
    try {
      c = Class.forName("com.thinginginjava.TypeInfo.FancyToy");
    } catch (ClassNotFoundException e) {
      System.out.println("Can't find FancyToy");
      System.exit(1);
    }
    printInfo(c);
    for(Class face : c.getInterfaces()){//Class.getInterfaces()放回的是Class对象，表示在感兴趣的Class对象中所包含的接口
      printInfo(face);
    }
    Class up = c.getSuperclass();//getSuperclass()查询直接基类
    Object obj = null;
    try {
      //需要默认的构造器
      obj = up.newInstance();
      //Class的newInstance()是实现"虚拟构造器"的一种途径，虚拟构造器允许你声明：
      //"我不知道你的确切类型，但是无论如何要正确地创建你自己"
    } catch (InstantiationException e) {
      System.out.println("Cannot instatiate");
    } catch (IllegalAccessException e) {
      System.out.println("Cannot access");
    }
    System.out.println("--------------------------------");
    printInfo(obj.getClass());
  }

}


class Toy{
  Toy(){ }
  Toy(int i){
    System.out.println("Creating Toy(" + i + ") object");
  }
}

interface HasBatteries{}
interface Waterproof{}
interface Shoots{}

class FancyToy extends Toy implements HasBatteries,Waterproof,Shoots{
  FancyToy(){super(1);}
}


