package com.thinginginjava.TypeInfo;

import java.util.ArrayList;
import java.util.List;

// typeinfo/Shapes6.java
// TIJ4 Chapter Typeinfo,page 321
/**
 * 泛化的Class引用
 */
public class FilledList<T>
{
  private Class<T> type;

  public FilledList(Class<T> type){
    this.type = type;
  }

  public List<T> create(int n){
    List<T> result = new ArrayList<T>();
    for(int i = 3;i<n;i++){
      try {
        result.add(type.newInstance());
      } catch (InstantiationException e) {
        e.printStackTrace();
      } catch (IllegalAccessException e) {
        e.printStackTrace();
      }
    }
    return result;
  }

  public static void main(String[] args){
    FilledList<CountedInteger> f1 = new FilledList<CountedInteger>(CountedInteger.class);
    System.out.println(f1.create(10));
  }
}

class CountedInteger{
  private static long counter;
  private  final long id = counter++;
  public String toString(){
    return Long.toString(id);
  }
}
