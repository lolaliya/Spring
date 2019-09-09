package com.dev.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dev.beans.User;

public class JPAImpl implements UserDAO {
	private final static EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory("MySQLUnit");
	
	public Boolean createProfile(User user) {
		Boolean state = false;
		try {
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(user);
			em.getTransaction().commit();
			em.close();
			state = true;
		} catch (Exception e) {
			//throw custom exception
			e.printStackTrace();
		}
		return state;
	}

	public User getUser(Integer userId) {
		EntityManager em = emf.createEntityManager();
		User user = em.find(User.class, userId);
		em.close();
		return user;
	}

	public User removeUser(Integer userId) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		User user = em.find(User.class, userId);
		em.remove(user);
		em.getTransaction().commit();
		em.close();
		return user;
	}

	public Boolean updatePassword(Integer userId, String passwd) {
		Boolean state = false;
		try {
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			User user = em.find(User.class, userId);
			user.setPassword(passwd);
			em.getTransaction().commit();
			em.close();
			state = true;
		} catch (Exception e) {
			//Custom Exception
			e.printStackTrace();
		}
		return state;
	}
	
}