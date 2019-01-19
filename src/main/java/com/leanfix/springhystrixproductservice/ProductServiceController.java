package com.leanfix.springhystrixproductservice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.leanfix.springhystrixproductservice.Product;

@RestController
public class ProductServiceController {
	 private static Map<String, List<Product>> categoryDB = new HashMap<String, List<Product>>();
	 
	    static {
	    	categoryDB = new HashMap<String, List<Product>>();
	 
	        List<Product> lst = new ArrayList<Product>();
	        Product std = new Product("PRD-1", "COMP-X");
	        lst.add(std);
	        std = new Product("PRD-2", "COMP-Y");
	        lst.add(std);
	 
	        categoryDB.put("CATEG-A", lst);
	 
	        lst = new ArrayList<Product>();
	        std = new Product("PRD-7", "COMP-ASD");
	        lst.add(std);
	        std = new Product("PRD-8", "COMP-RT");
	        lst.add(std);
	        std = new Product("PRD-9", "COMP-RT");
	        lst.add(std);
	 
	        categoryDB.put("CATEG-B", lst);
	 
	    }
	 
	    @RequestMapping(value = "/getProductDetailsForCategory/{category}", method = RequestMethod.GET)
	    public List<Product> getProducts(@PathVariable String category) {
	        System.out.println("Getting Product details for " + category);
	 
	        List<Product> productList = categoryDB.get(category);
	        if (productList == null) {
	        	productList = new ArrayList<Product>();
	            Product std = new Product("Not Found", "N/A");
	            productList.add(std);
	        }
	        return productList;
	    }

}
