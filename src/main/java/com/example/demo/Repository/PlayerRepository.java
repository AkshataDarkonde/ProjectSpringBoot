package com.example.demo.Repository;

import com.example.demo.Bean.Player;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlayerRepository extends CrudRepository<Player,Integer>
{
    List<Player> findByName(String firstname);
}
