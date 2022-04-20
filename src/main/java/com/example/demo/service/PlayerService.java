package com.example.demo.service;

import com.example.demo.Bean.Player;
import com.example.demo.Repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {
    @Autowired
    static
    PlayerRepository playerRepository;

    public static List<Player> getAllPlayers(){
       List<Player> playerList = new ArrayList<>();
       playerRepository.findAll().forEach(p -> playerList.add(p));
       return playerList;
    }
    public Player getplayer(int playerId){
        List<Player> playerList = new ArrayList<>();
        Player player = new Player();
        playerRepository.findById(playerId).get();
        return playerRepository.findById(playerId).get();
    }
    public Player addplayer(Player player){
        Player p1 = playerRepository.save(player);
        return p1;
    }
    public Player updateplayer(Player player){
        Player p2=playerRepository.save(player);
        return p2;
    }
    public void deleteplayer(int playerId){
        playerRepository.deleteById(playerId);
    }

}
