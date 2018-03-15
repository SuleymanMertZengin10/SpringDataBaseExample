package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import model.Customer;

public class CustomerDaoImp implements CustomerDao{

	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	
	
	
	public CustomerDaoImp() {
		super();
	}


	public CustomerDaoImp(EntityManagerFactory entityManagerFactory) {
		super();
		this.entityManagerFactory = entityManagerFactory;
		entityManager=entityManagerFactory.createEntityManager();
	}


	@Override
	public void insertCustomer(Customer customer) {
		entityManager.getTransaction().begin();	
		entityManager.persist(customer);
		entityManager.getTransaction().commit();
		
	}

}
