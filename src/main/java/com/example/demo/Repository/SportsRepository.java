package com.example.demo.Repository;

import com.example.demo.Bean.Sports;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SportsRepository extends CrudRepository<Sports,Integer>
{
    List<Sports> findByNoOfPlayers(int NoOfPlayers);
}
