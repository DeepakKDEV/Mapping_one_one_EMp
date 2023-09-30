package com.geekster.mapping.controller;

import com.geekster.mapping.model.Address;
import com.geekster.mapping.model.Emp;
import com.geekster.mapping.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class AddressController {


    @Autowired
    AddressService addressService;

    @PostMapping("address")
    public String AddressList(@RequestBody List<Address> newAddress) {
        return addressService.saveAddress(newAddress);
    }

    @GetMapping("get/Address")
    public List<Address> getAddress() {
        return addressService.getAddress();
    }

    @GetMapping("get/Address/{id}")
    public  Optional<Address> addressByGet(@PathVariable Long id){
        return  addressService.addressByGet(id);
    }

    @DeleteMapping("delete/Address/id/{id}")
    public String deleteAddressById(Long id){
        return addressService.deleteAddressById(id);
    }
    @PutMapping("updateAddress/id/{id}")
    public String updateAddress(@PathVariable Long id,  @RequestParam String address){
        return addressService.updateAddress(id,address);
    }

}
