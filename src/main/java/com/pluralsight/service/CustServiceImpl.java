package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repo.CustRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jsst_ on 12/7/2017.
 */
@Service("custService")
public class CustServiceImpl implements CustService {
    //@Autowired
    private CustRepo custRepo;

    public CustServiceImpl(){}

    @Autowired
    public CustServiceImpl(CustRepo custRepo) {
        this.custRepo = custRepo;
    }


  /*  @Autowired
  public void setCustRepo(CustRepo custRepo) {
        this.custRepo = custRepo;
    }*/

    public List<Customer> findAll(){
        return custRepo.findAll();
    }
}
