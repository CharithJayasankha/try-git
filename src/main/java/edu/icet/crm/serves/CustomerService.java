package edu.icet.crm.serves;

import edu.icet.crm.model.Customer;

public class CustomerService {
    public Customer getCustomer(){
        Customer customer = new Customer();
        customer.setName("charith jaysankha");
        customer.setAge(20);
        customer.setPhoneNumber("0778626611");
        return customer;
    }
}
