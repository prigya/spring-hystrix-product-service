package com.leanfix.springhystrixproductservice;

public class Product {
	
	 private String pname;
	    private String company;
	 
	    public Product(String pname, String company) {
	        super();
	        this.pname = pname;
	        this.company = company;
	    }
	 
	    public String getPname() {
	        return pname;
	    }
	 
	    public void setPname(String pname) {
	        this.pname = pname;
	    }
	 
	    public String getCompany() {
	        return company;
	    }
	 
	    public void setCompany(String company) {
	        this.company = company;
	    }

}
