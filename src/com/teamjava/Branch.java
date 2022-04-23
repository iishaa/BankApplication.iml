package com.teamjava;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getName() {
        return name;
    }
    public boolean newCustomers(String newname, double amount) {
        if(findCustomer(newname) == null ) {
            this.customers.add(new Customer(newname,amount));
            return true;
        }
        return false;
    }
    public boolean addtranscation(String customerName, double amount) {
      Customer existcustomer = findCustomer(customerName);
      if(existcustomer != null){
          existcustomer.addTransaction(amount);
            return true;
        }
        return false;
    }
    public Customer findCustomer(String customerName) {
        for(int i=0; i<this.customers.size(); i++){
            Customer checkedcustomer = this.customers.get(i);
            if(checkedcustomer.getName().equals(customerName)) {
                return checkedcustomer;
            }
        }
        return null;
    }

}
