package nLayerdDemo.business.abtracts;

import java.util.List;

import nLayerdDemo.entities.concretes.Product;

public interface IProductService {
	void add(Product product);
	List<Product> getAll();
	
	

}
