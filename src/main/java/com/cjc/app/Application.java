package com.cjc.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cjc.app.model.Customer;
import com.cjc.app.model.Product;
import com.cjc.app.repository.CustomerRepository;
import com.cjc.app.repository.ProductRepository;

@SpringBootApplication
public class Application {

public void m1(){

}

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		CustomerRepository customerRepository = context.getBean(CustomerRepository.class);

		ProductRepository productRepository = context.getBean(ProductRepository.class);

		Product pr1 = new Product(101, "TV", "Black", 50000);
		Product pr2 = new Product(102, "Laptop", "Navy", 52000);
		Product pr3 = new Product(103, "Fan", "Brown", 5000);
		Product pr4 = new Product(104, "Mobile", "Black", 25000);
		Product pr5 = new Product(105, "Table", "white", 8000);
		Product pr6 = new Product(106, "Chair", "Brown", 3000);

		Customer cust1 = new Customer();
		cust1.setCid(1);
		cust1.setCname("John");
		cust1.setAddress("Akurdi");
		cust1.setProdList(Arrays.asList(pr1));

		Customer cust2 = new Customer();
		cust2.setCid(2);
		cust2.setCname("Jane");
		cust2.setAddress("Akurdi");
		cust2.setProdList(Arrays.asList(pr1, pr2));

		Customer cust3 = new Customer();
		cust3.setCid(3);
		cust3.setCname("Sam");
		cust3.setAddress("Nigdi");
		cust3.setProdList(Arrays.asList(pr3, pr4, pr5));

		Customer cust4 = new Customer();
		cust4.setCid(4);
		cust4.setCname("David");
		cust4.setAddress("Nigdi");
		cust4.setProdList(Arrays.asList(pr3, pr4, pr5, pr6));

		// assign customer to product

		pr1.setCustList(Arrays.asList(cust1, cust2));

		pr2.setCustList(Arrays.asList(cust2));

		pr3.setCustList(Arrays.asList(cust3, cust4));

		pr4.setCustList(Arrays.asList(cust3, cust4));

		pr5.setCustList(Arrays.asList(cust3, cust4));

		pr6.setCustList(Arrays.asList(cust4));

		customerRepository.saveAll(Arrays.asList(cust1, cust2, cust3, cust4));

	}

}
