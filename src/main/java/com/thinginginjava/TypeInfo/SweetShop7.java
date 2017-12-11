package com.thinginginjava.TypeInfo;

// typeinfo/SweetShop7.java
// TIJ4 Chapter Typeinfo, Exercise 7, page 318
/* 修改 SweetShop.java，使每种类型对象的创建由命令行参数控制。
* 即，如果命令行是"java SweetShop Candy",那么只有Candy对象被创建。
* 注意你是如何通过命令行参数来控制加载哪个Class对象。
*/
public class SweetShop7 {
  public static void main(String[] args) {
    if(args.length < 1) {
      System.out.println("Usage: sweetName");
      System.exit(0);
    }
    Class c = null;
    try {
      c = Class.forName(args[0]);
      System.out.println("Enjoy your " + args[0]);
    } catch(ClassNotFoundException e) {
      System.out.println("Couldn't find " + args[0]);
    }
  }
}
