package com.dev.app;

import com.dev.services.UserServices;
import com.dev.services.UserServicesImpl;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import associations.one_to_many.Pencil;
import associations.one_to_many.PencilBox_UniDirectional;

public class App {
	public static void main(String[] args) {
	
		EntityManagerFactory emf =
				Persistence.createEntityManagerFactory("MySQLUnit");
		EntityManager em = emf.createEntityManager();

		em.close();
		emf.close();

	}
}






//
//package com.dev.app;
//
//import java.util.Scanner;
//
//import com.dev.beans.User;
//import com.dev.services.UserServices;
//import com.dev.services.UserServicesImpl;
//
//public class App {
//	public static void main(String[] args) {
//		//to add users into database
//		User user = null;
//		Scanner in = new Scanner(System.in);
//		user = new User();
//		System.out.println("enter the id:");
//		user.setUserId(Integer.parseInt(in.nextLine()));
//		System.out.println("enter the first name: ");
//		user.setFirstName(in.nextLine());
//		System.out.println("enter the last name: ");
//		user.setLastName(in.nextLine());
//		System.out.println("enter the password: ");
//		user.setPassword(in.nextLine());
//
//		in.close();
//
//		UserServices services = new UserServicesImpl();
//		Boolean state = services.createProfile(user);
//		if(state){
//			System.out.println("Sucessful in profile creation");
//		}else{
//			System.out.println("Failed in profile creation");
//		}
//
//
//		//to add users
//		UserServices services = new UserServicesImpl();
//		User u =services.getUser(1);
//		System.out.println(u);
//
//		//to update password
//		System.out.println(services.getUser(1));
//		services.updatePassword(2, "toor");
//		System.out.println(services.getUser(2));
//
//		//to remove user
//	}
//}