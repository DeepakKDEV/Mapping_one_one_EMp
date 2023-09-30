package com.geekster.mapping.repo;

import com.geekster.mapping.model.Address;
import com.geekster.mapping.model.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IEmpRepo extends JpaRepository<Emp,Long> {


}
