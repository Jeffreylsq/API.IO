package io2;

import java.io.Serializable;
import java.util.Arrays;

public class Person implements Serializable {

	private String name;
	private String nick;
	private String []other;
	
	Person(String name, String nick , String []other){
		this.name = name ;
		this.nick = nick;
		this.other = other;
	}
	
	public void setOther(String[] other) {
		this.other = other;
	}
	
	public String [] getOther() {
		return other;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	
	public String toString() {
		
		return  name + " ×Ö  " + nick + " " + Arrays.toString(other);
	}
}
