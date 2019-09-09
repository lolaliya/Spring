package com.dev.spring.core.beans;

public class PersonXML {

	public PersonXML()
	{
	}

//	public PersonXML(String name, Job job) {
//		this.name = name;
//		this.job = job;
//		System.out.println("calling arg-const "+name);
//	} 


	private String name;
	private Job job;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + "]";
	}
}