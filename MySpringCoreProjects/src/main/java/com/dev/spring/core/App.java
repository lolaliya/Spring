package com.dev.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.dev.spring.core.beans.Car;
import com.dev.spring.core.beans.Job;
import com.dev.spring.core.beans.Person;
import com.dev.spring.core.beans.PersonXML;
import com.dev.spring.core.beans.PhoneNumbers;
import com.dev.spring.core.config.CarConfig;
import com.dev.spring.core.config.PersonConfig;
import com.dev.spring.core.config.PhoneConifg;

public class App 
{
	public static void main( String[] args )
	{
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(PhoneConifg.class);
//		PhoneNumbers numbers = ctx.getBean(PhoneNumbers.class,"numbers");
//		System.out.println(numbers);


		//        AnnotationConfigApplicationContext ctx = 
		//	   new AnnotationConfigApplicationContext(PersonConfig.class);
		//       Person p = ctx.getBean(Person.class,"person");
		//       System.out.println(p.getName());
		//       p.getJob().doJob();
		//       

		//				Car car = ctx.getBean(Car.class,"car");
		//				System.out.println("Model: " + car.getModel());
		//				System.out.println("Brand: " + car.getBrand());
		//				System.out.println(car.getEngine());
		//				car.getEngine().start();
		//				car.getEngine().stop();

				ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/config/PhoneConfig.xml");
								PhoneNumbers numbers = ctx.getBean(PhoneNumbers.class,"numbers");
								System.out.println(numbers);


		//		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("C:/Users/nisar/Desktop/PersonConfig.xml");
		//		PersonXML p = ctx.getBean(PersonXML.class,"person");
		//		System.out.println(p.getName());
		//		p.getJob().doJob();
								
								ctx.close();
	}
}