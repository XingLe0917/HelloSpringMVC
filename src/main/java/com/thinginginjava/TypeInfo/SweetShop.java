package com.thinginginjava.TypeInfo;

class Candy {

  static {
    System.out.println("Loading Candy");
  }
}

class Gum {

  static {
    System.out.println("Loading Gum");
  }
}

class Cookie {

  static {
    System.out.println("Loading Cookie");
  }
}

public class SweetShop {

  public static void main(String[] args) {
    System.out.println("inside main");
    new Candy();
    System.out.println("After creating Candy");
    try {
      //Class.forName 是取得Class对象的引用的一种方法
      Class c = Class.forName("com.thinginginjava.TypeInfo.Gum");
      System.out.println(
          "Class name :" + c.getName() + " is interface ?" + c.isInterface() + ",Simple name :" + c
              .getSimpleName());
    } catch (ClassNotFoundException e) {
      System.out.println("Couldn't find Gum");
    }
    System.out.println("After Class.forName(\"Gum\")");
    new Cookie();
    System.out.println("After creating Cookie");
  }


}
