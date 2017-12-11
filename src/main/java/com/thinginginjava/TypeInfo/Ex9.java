package com.thinginginjava.TypeInfo;

// typeinfo/Ex9.java
// TIJ4 Chapter Typeinfo, Exercise 9, page 318
// 修改前一个练习，让这个方法使用 Class.getDeclaredFields()来打印一个类中的域的相关信息。
public class Ex9 {

  public static void Hierarchy(Object o ){
    Object[] fields = o.getClass().getDeclaredFields();
    if(fields.length == 0){
      System.out.println(o.getClass() + " has no fields");
    }
    if(fields.length > 0){
      System.out.println("Field(s) of " + o.getClass() + ":");
      for (Object obj : fields) {
        System.out.println(" "+obj);
      }
    }
    if(o.getClass().getSuperclass() != null) {
      System.out.println(o.getClass() + " is a subclass of " +
          o.getClass().getSuperclass());
      try {
        Hierarchy(o.getClass().getSuperclass().newInstance());
      } catch(InstantiationException e) {
        System.out.println("Unabloe to instantiate obj");
      } catch(IllegalAccessException e) {
        System.out.println("Unable to access");
      }
    }
  }

  public static void main(String[] args) {
    Hierarchy(new C());
  }

}
