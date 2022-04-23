package com.teamjava;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Indian Bank");
        bank.addBranch("Mumbai Branch");
        bank.addCustomers("Mumbai Branch", "Alok Singh", 10000);
        bank.addCustomers("Mumbai Branch", "Isha Raj", 10000);
        bank.addCustomers("Mumbai Branch", "Akanksha Singh", 8000);

        bank.addBranch("Delhi Branch");
        bank.addCustomers("Delhi Branch", "Akanksha Singh", 8000);
        bank.addCustomers("Delhi Branch", "Manisha Kumari", 8000);

        bank.addTransactions("Mumbai Branch", "Alok Singh",600);
        bank.addTransactions("Mumbai Branch", "Alok Singh",1000);
        bank.addTransactions("Mumbai Branch", "Isha Raj",1500);
        bank.addTransactions("Delhi Branch", "Akanksha Singh",1800);
        bank.addTransactions("Delhi Branch", "Manisha Kumari",1500);

        bank.listCustomer("Mumbai Branch",true);
        bank.listCustomer("Delhi Branch",true);

    }
}
