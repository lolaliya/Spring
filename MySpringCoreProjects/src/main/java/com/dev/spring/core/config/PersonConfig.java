package com.dev.spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dev.spring.core.beans.Job;
import com.dev.spring.core.beans.Person;
import com.dev.spring.core.beans.SoftwareDeveloper;

@Configuration
public class PersonConfig {
	
//	@Bean("person")
//	public Person getPerson(Job job){
//		Person p = new Person();
//		p.setName("Aatish");
//		p.setJob(job);
//		return p;
//	}
//	
//	@Bean("job")
//	public Job getJob(){
//		return new SoftwareDeveloper();
//	}
}