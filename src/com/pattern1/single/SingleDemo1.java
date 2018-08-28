package com.pattern1.single;

public class SingleDemo1 {
	
	/**
	 * 饿汉式单例模式
	 */
	private static SingleDemo1 s=new SingleDemo1();
	
	private SingleDemo1() {}  //私有化构造器
	
	private static SingleDemo1 getSingleDemo1() {
		
		return s;
	}

}
