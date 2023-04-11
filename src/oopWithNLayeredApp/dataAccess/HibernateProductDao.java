package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao{
	public void add(Product product) {
		// just write DB access codes 
		System.out.println("Product added with Hibernate.");
	}
}
