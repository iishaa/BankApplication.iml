package com.teamjava;

import java.util.ArrayList;

public class Customer {
   private String  name;
   private ArrayList<Double> transactions;

   public ArrayList<Double> getTransactions() {
      return transactions;
   }

   public String getName() {
      return name;
   }

   public Customer(String name, double initialAmount) {
      this.name = name;
      this.transactions = new ArrayList<Double>();
      this.addTransaction(initialAmount);
   }
   public void addTransaction(double amount) {
      this.transactions.add(amount);
   }
}
