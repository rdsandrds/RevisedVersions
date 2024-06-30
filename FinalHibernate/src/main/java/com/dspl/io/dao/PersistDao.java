package com.dspl.io.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Query;

import com.dspl.io.entity.Employee;

public class PersistDao {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("amit");
	private static EntityManager em = emf.createEntityManager();
	private static  EntityTransaction et = em.getTransaction();
	
	public static void addEmployee(Employee e) {	
		et.begin();
		em.persist(e);
		et.commit();
	}
	
	public static List<Employee> fetchAll(){
		javax.persistence.Query q = em.createQuery("SELECT e FROM Employee e");
		List<Employee> employees = q.getResultList();
		return employees;
	}
	
	public static Employee getEmployee(int id) {
		return em.find(Employee.class, id);
	}
	
	public static void deleteEmployee(int id) {
		Employee e =  em.find(Employee.class, id);
		if (e != null) {
			et.begin();
			em.remove(e);
			et.commit();
		}
	}

	public static void updateEmployee(Employee e) {
		et.begin();
		em.merge(e);
		et.commit();
	}
	
}
