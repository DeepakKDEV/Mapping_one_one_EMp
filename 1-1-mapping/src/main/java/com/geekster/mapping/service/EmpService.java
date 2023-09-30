package com.geekster.mapping.service;


import com.geekster.mapping.model.Emp;
import com.geekster.mapping.repo.IAddressRepo;
import com.geekster.mapping.repo.IEmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpService {


    @Autowired
    IEmpRepo empRepo;

    @Autowired
    IAddressRepo addressRepo;
    public List<Emp> getEmployees() {
        return empRepo.findAll();
    }

    public String saveEmp(List<Emp> newEmp) {
        empRepo.saveAll(newEmp);
        return "emp added";
    }

    public List<Emp> getEmp() {
      return   empRepo.findAll();
    }

    public Optional<Emp> getById(long id) {
        return  empRepo.findById(id);
    }

    public String updateEmp(Long id, String myName) {
       Emp   add = empRepo.findById(id).get();
        add.setFirstName(myName);
        empRepo.save(add);
        return "updated";
    }

    public String deleteEmpById(Long id) {
       empRepo.deleteById(id);
       return "delete by id all row";
    }
}
