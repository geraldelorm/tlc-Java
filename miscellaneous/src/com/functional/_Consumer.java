package com.functional;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {

        greetCustomer(new Customer("Gee", "290239398"));

        greetCustomerFunc.accept(new Customer("Gee Bi", "290239398"));

        BigreetCustomer.accept(new Customer("Gee Bi", "290239398"), false);
    }


    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName + ". Thanks for registering on " + customer.customerPhoneNumber);
    }

    static Consumer<Customer> greetCustomerFunc = customer ->
            System.out.println("Hello " + customer.customerName + ". Thanks for registering on " + customer.customerPhoneNumber);

    static BiConsumer<Customer, Boolean> BigreetCustomer = (customer, showNum) ->
            System.out.println("Hello " + customer.customerName + ". Thanks for registering on " + (showNum ? customer.customerPhoneNumber : "*******"));




    static class Customer{
        private final String customerName;
        private  final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
