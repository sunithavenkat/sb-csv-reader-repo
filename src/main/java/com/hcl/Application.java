package com.hcl;

import java.io.IOException;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.hcl.model.Product;
import com.hcl.service.CsvReader;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws IOException {
               ConfigurableApplicationContext ctx=SpringApplication.run(Application.class,args);
                            CsvReader bean = ctx.getBean(CsvReader.class);
                            List<Product> FilterProducts = bean.readAndFilterProductsData();
          
                            FilterProducts.forEach(System.out::println);
	}

}
