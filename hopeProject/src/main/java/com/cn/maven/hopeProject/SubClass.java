package com.cn.maven.hopeProject;


public class SubClass extends ParentClass {

	public static String staticField="子类静态变量";
	public final String finalField="子类常量";
	public static final String staticFinalField="子类静态常量";
	public static void main(String[] args){
		SubClass subClass = new SubClass();
		
		System.out.println(SubClass.staticField);
		System.out.println(subClass.finalField);
		System.out.println(SubClass.staticFinalField);
	}
}
