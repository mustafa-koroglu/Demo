package nLayerdDemo;

import nLayerdDemo.business.abtracts.IProductService;
import nLayerdDemo.business.concretes.ProductManager;
import nLayerdDemo.core.JLoggerManagerAdapter;
import nLayerdDemo.dataAccess.concretes.HibernateProductDao;
import nLayerdDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {

		// ToDo: spring IoC ile çözülecek

		IProductService productService = new ProductManager(new HibernateProductDao(), new JLoggerManagerAdapter());
		Product product = new Product(1, 2, "Elma", 12, 50);
		productService.add(product);
		IProductService productService2 = new ProductManager(new HibernateProductDao(), new JLoggerManagerAdapter());
		Product product2 = new Product(1, 3, "Armut", 12, 50);
		productService2.add(product2);

	}

}
