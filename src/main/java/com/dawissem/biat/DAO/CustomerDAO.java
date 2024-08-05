package com.dawissem.biat.DAO;

import com.dawissem.biat.Entity.Customer;
import com.dawissem.biat.Enum.CustomerEnum;
import com.dawissem.biat.Enum.GenderEnum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

public interface CustomerDAO extends JpaRepository<Customer,Integer> {




}
