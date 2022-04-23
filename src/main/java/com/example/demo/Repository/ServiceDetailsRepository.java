package com.example.demo.Repository;

import com.example.demo.Bean.Servicedetails;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ServiceDetailsRepository extends CrudRepository<Servicedetails,Integer> {
    List<Servicedetails> findByTime(int serviceId);
}
