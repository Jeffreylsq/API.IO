package io;

import java.io.Serializable;     //

import java.util.Arrays;

/**
 * 使用当前类来测试对象流的对象读写操作
 * 当前类实例若想被对象流进行读写，那么必须实现接口
 * java.io.Serializable
 * @author pc
 *
 */

public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;  //如果你实现Serializable 系统自动给你一个序列化版本号
	private String name;
	private int age;
	private String gender;
	
	/*
	 * transient关键字
	 * 被其修饰的属性在该对象进行序列化时值会被忽略
	 * 忽略不必要的属性值可以达到对象序列化时瘦身的操作，减少资源开销
	 */
	private transient String[] otherInfo;
	
	
	
	public static void main(String[] args) {

		
	}
	public Person(String name, int age, String gender, String[] otherInfo) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.otherInfo = otherInfo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(String[] otherInfo) {
		this.otherInfo = otherInfo;
	}
	
	public String toString() {
		
		return name + " , " + age + " , " + gender + " , " + Arrays.toString(otherInfo) ;
	}
	
	
	
	

}
