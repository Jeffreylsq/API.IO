package io;

import java.io.Serializable;     //

import java.util.Arrays;

/**
 * ʹ�õ�ǰ�������Զ������Ķ����д����
 * ��ǰ��ʵ�����뱻���������ж�д����ô����ʵ�ֽӿ�
 * java.io.Serializable
 * @author pc
 *
 */

public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;  //�����ʵ��Serializable ϵͳ�Զ�����һ�����л��汾��
	private String name;
	private int age;
	private String gender;
	
	/*
	 * transient�ؼ���
	 * �������ε������ڸö���������л�ʱֵ�ᱻ����
	 * ���Բ���Ҫ������ֵ���Դﵽ�������л�ʱ����Ĳ�����������Դ����
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
