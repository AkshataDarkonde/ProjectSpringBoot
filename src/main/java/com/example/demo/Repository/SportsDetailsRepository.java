package com.example.demo.Repository;

import com.example.demo.Bean.SportsDetails;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SportsDetailsRepository extends CrudRepository<SportsDetails,Integer> {
    List<SportsDetails> findById(int id);
}
