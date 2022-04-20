package com.example.demo.Controller;

import com.example.demo.Bean.Player;
import com.example.demo.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController {
    @Autowired
    PlayerService playerService;

    @GetMapping("/getAllPlayers")

    List<Player> getAllPlayers(){
        System.out.println("From get all Player");
        List<Player> PlayerList = PlayerService.getAllPlayers();
        return PlayerList;
    }
    @GetMapping("/getPlayer/{playerId}")
    Player getplayer(@PathVariable("playerId") int id){
        System.out.println("from get Player");
        return playerService.getplayer(id);
    }
    @PostMapping("/addplayer")
   Player addplayer(@RequestBody Player player){
        System.out.println("from add Player");
        return playerService.addplayer(player);
    }
    @PutMapping("/updatepalyer")
    Player updateplayer(@RequestBody Player player){
        System.out.println("from update PLayer");
        return playerService.updateplayer(player);
    }
    @DeleteMapping("/deleteplayer/{playerId}")
    void deleteplayer(@PathVariable("playerid")int id){
        System.out.println("from delete player");
        playerService.deleteplayer(id);
    }


}
