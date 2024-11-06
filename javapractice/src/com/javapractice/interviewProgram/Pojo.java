package com.javapractice.interviewProgram;

public class Pojo {
	
	private String name;
	private int id;
	
	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getID() {
		return id;
	}
	public void setID(int id) {
		this.id=id;
	}
	
	
	public static void main(String[] args) {
		Pojo p=new Pojo();
		
		p.setName("John");
		p.setID(12345);
		System.out.println("Name:"+p.getName());
		System.out.println("ID:"+p.getID());
	}

}
