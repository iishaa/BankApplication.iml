package com.teamjava;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public String getName() {
        return name;
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomers(String branchName, String customerName, double initaialAmount) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.newCustomers(customerName, initaialAmount);
        }
        return false;
    }
    public boolean addTransactions(String branch, String name,double amount) {
        Branch branch1 = findBranch(branch);
        if(branch1 != null) {
            return branch1.addtranscation(name,amount);
        }
        return false;
    }
    public boolean listCustomer(String branchName, boolean showTransaction) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            System.out.println("Customer details for branch: " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(int i=0; i<branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]" );
                if (showTransaction) {
                    System.out.println("Transactions");
                    ArrayList<Double> transaction = branchCustomer.getTransactions();
                    for(int j=0; j< transaction.size(); j++) {
                        System.out.println("[" + (j+1) + "] Amount " + transaction.get(j) );
                    }
                }
            }
            return true;
        }else{
            return false;
        }
    }
    private Branch findBranch(String branchName) {
        for(int i=0; i<this.branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
            if(checkedBranch.getName().equals(branchName))
                return checkedBranch;
        }
        return null;
    }

}
