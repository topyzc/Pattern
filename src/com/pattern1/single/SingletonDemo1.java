package com.pattern1.single;

public class SingletonDemo1 {
	
	/**
	 * 饿汉式单例模式
	 */
	private static SingletonDemo1 s=new SingletonDemo1();
	
	private SingletonDemo1() {}  //私有化构造器
	
	private static SingletonDemo1 getSingleDemo1() {
		
		return s;
	}

}
