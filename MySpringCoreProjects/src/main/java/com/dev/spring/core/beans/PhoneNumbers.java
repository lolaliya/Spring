package com.dev.spring.core.beans;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumbers {
	
List<String> numbers = new ArrayList<String>();
List<User> users = new ArrayList<User>();
public List<String> getNumbers() {
	return numbers;
}
public void setNumbers(List<String> numbers) {
	this.numbers = numbers;
}
public List<User> getUsers() {
	return users;
}
public void setUsers(List<User> users) {
	this.users = users;
}
@Override
public String toString() {
	return "PhoneNumbers [numbers=" + numbers + ", users=" + users + "]";
}



}
