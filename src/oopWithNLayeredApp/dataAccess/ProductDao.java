package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public interface ProductDao {
	// Interfaces can only contain method signature
	void add(Product product);
}
