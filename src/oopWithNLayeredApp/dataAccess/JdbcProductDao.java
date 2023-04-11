package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{
	// Dao -> Data Access Object
	// Dal -> Data Access Layer (.NET)
	
	public void add(Product product) {
		// just write DB access codes 
		System.out.println("Product added with JDBC.");
	}
	
}
