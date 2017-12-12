package com.pluralsight.repo;

import com.pluralsight.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jsst_ on 12/7/2017.
 */
@Repository("custRepo")
public class HibernateCustRepoImpl implements CustRepo{

    public List<Customer> findAll(){
        List<Customer> custList = new ArrayList<>();
        Customer c= new Customer();
        c.setFirstName("Jess");
        c.setLastName("Coutinho");
        custList.add(c);
        return custList;
    }
}
