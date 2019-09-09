package com.dev.spring.core.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dev.spring.core.beans.PhoneNumbers;

@Configuration
public class PhoneConifg {

	@Bean
	public PhoneNumbers getPhoneNumber()
	{
		PhoneNumbers phoneNumbers = new PhoneNumbers();
		List<String> numbers = new ArrayList<String>();
		numbers.add("1234");
		numbers.add("1235");
		numbers.add("1236");
		numbers.add("1237");
		phoneNumbers.setNumbers(numbers);
		return phoneNumbers;
	}
}
