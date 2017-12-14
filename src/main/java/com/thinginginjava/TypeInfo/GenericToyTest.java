package com.thinginginjava.TypeInfo;

// typeinfo/Shapes6.java
// TIJ4 Chapter Typeinfo,page 322
/**
 * 泛化的Class引用
 */
public class GenericToyTest {
  public static void main(String[] args) throws IllegalAccessException, InstantiationException {

    Class<FancyToy> ftClass = FancyToy.class;
    FancyToy fancyToy = ftClass.newInstance();
    /**
     * 如果你手头的是超类，那编译器将只允许你声明超类引用是"某个类，它是FancyToy超类，
     * 就像在表达式 Class<? super FancyToy> 中看到的，而不会接受 Class<Toy> 这样的声明。
     */
    Class<? super FancyToy> up = ftClass.getSuperclass();
    //不能编译
    //Class<Toy> up2 = ftClass.getSuperclass();

    //only produces Object
    Object obj = ftClass.getSuperclass();
  }


}
