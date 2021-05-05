package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.dataAccess.concretes.NewPopularABCProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

    public static void main(String[] args) {
        ProductService manager = new ProductManager(new NewPopularABCProductDao(), new JLoggerManagerAdapter());

        Product product = new Product(1, 2, "Elma", 12, 50);

        manager.add(product);


    }
}
