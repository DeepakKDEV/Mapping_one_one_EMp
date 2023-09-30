package com.geekster.mapping.controller;

import com.geekster.mapping.model.Emp;
import com.geekster.mapping.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmpController {

    @Autowired
    EmpService empService;


    @PostMapping("emp")
    public String addEmp(@RequestBody List<Emp> newEmp)
    {
        return empService.saveEmp(newEmp);
    }
    @GetMapping("get/Emp")
    public List<Emp> getEmp(){
        return   empService.getEmp();
    }
    @GetMapping("getEmp/By/id/{id}")
        public Optional<Emp> getById(@PathVariable  Long id){
           return empService.getById(id);
        }

    @PutMapping("Emp/{id}")
    public String updateEmp(@PathVariable Long id,  @RequestParam String myName)
     {
        return empService.updateEmp(id, myName);
     }

     @DeleteMapping("deleteEmpBy/id/{id}")
       public String deleteEmpById(Long id){
        return empService.deleteEmpById(id);
     }
}

