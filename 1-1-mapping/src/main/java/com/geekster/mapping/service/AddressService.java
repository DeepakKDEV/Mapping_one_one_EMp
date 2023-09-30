package com.geekster.mapping.service;

import com.geekster.mapping.model.Address;
import com.geekster.mapping.model.Emp;
import com.geekster.mapping.repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class AddressService {

    @Autowired
    IAddressRepo iAddressRepo;

    public String saveAddress(List<Address> newAddress) {

        iAddressRepo.saveAll(newAddress);
        return "added";
    }

    public List<Address> getAddress() {
      return  iAddressRepo.findAll();
    }
    public Optional<Address> addressByGet(Long id) {
        return iAddressRepo.findById(Math.toIntExact(id));
    }

    public String deleteAddressById(Long id) {
        iAddressRepo.deleteById(Math.toIntExact(id));
        return "delete address by id";
    }

    public String updateAddress(Long id, String address) {
        Address add = iAddressRepo.findById(Math.toIntExact(id)).get();
        add.setCity(String.valueOf(address));
        iAddressRepo.save(add);
        return "City Name updated Successfully!";
    }
}
