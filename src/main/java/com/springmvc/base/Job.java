package com.springmvc.base;

/*5.6 练习：
用protected数据创建一个类。在相同的文件里创建第二个类，用一个方法操纵第一个类里 的protected数据
*/
class Parent{
	protected String name;
	
	protected void myMethod()  
    {  
        System.out.println("protected method.");
    }  
}

public class Job extends Parent{
	
	void test(){
		Job job = new Job();
		//继承后可以访问类Parent中的protected变量
		String n = job.name;
		job.myMethod();
	}

}
