package com.dev.spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dev.spring.core.beans.Car;
import com.dev.spring.core.beans.Engine;
import com.dev.spring.core.beans.SoftwareDeveloper;
import com.dev.spring.core.beans.V8;

@Configuration
public class CarConfig {
	
	 @Bean("car")
		public Car getCar(Engine engine){
			Car c = new Car();
			c.setModel("abc");
			c.setBrand("xyz");
			c.setEngine(engine);
			return c;
		}
		
		@Bean("engine")
		public Engine getEngine(){
			return new V8();
		}
	}

