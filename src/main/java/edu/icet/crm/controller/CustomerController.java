package edu.icet.crm.controller;

import edu.icet.crm.model.Customer;
import edu.icet.crm.serves.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

        @GetMapping("/get-control")
        public Customer getCustomer(){

            for (int i=0; i<10; i++){
                System.out.println("number is "+ i);
            }


        CustomerService customerService = new CustomerService();
            return customerService.getCustomer();
    }
}
