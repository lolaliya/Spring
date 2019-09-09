package com.dev.spring.core.beans;

import org.springframework.stereotype.Component;

@Component("softwareDeveloper")
public class SoftwareDeveloper implements Job {
	
	
	public void doJob(){
		System.out.println("codes codes codes...");
	}
}