package com.dev.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.dev.spring.beans.User;


@Repository
public class JPAImpl implements UserDAO {
	private final static EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory("MySQLUnit");

	@Override
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

	@Override
	public User getUser(Integer userId) {
		EntityManager em = emf.createEntityManager();
		User user = em.find(User.class, userId);
		em.close();
		return user;
	}

	@Override
	public User removeUser(Integer userId) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		User user = em.find(User.class, userId);
		em.remove(user);
		em.getTransaction().commit();
		em.close();
		return user;
	}

	@Override
	public Boolean updatePassword(Integer userId, String passwd) {
		Boolean state = false;
		try {
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			com.dev.spring.beans.User user = em.find(User.class, userId);
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
	
	@Override
	public User login(Integer userId, String password) {
		User user = null;
		try{
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			TypedQuery<User> query = em.createQuery("from User u where userId= :id and password= :passwd", User.class);
			query.setParameter("id", userId);
			query.setParameter("passwd", password);
			List<User> users = query.getResultList();
			user = users.get(0);
			em.getTransaction().commit();
			em.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
}