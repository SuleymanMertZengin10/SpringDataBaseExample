package dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import model.Product;

public class ProductDaoImp implements ProductDao{

	private  EntityManagerFactory emf;
	private  EntityManager em;
	
	
	public ProductDaoImp(EntityManagerFactory emf) {
		super();
		this.emf = emf;
		em=emf.createEntityManager();
	}


	@Override
	public void addProduct(Product product) {
	  em.getTransaction().begin();
	  em.persist(product);
	  em.getTransaction().commit();
	
		
	}

}
