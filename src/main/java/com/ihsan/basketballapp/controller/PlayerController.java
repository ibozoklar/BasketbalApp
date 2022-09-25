package com.ihsan.basketballapp.controller;


import com.ihsan.basketballapp.repository.entity.Player;
import com.ihsan.basketballapp.repository.entity.Team;
import com.ihsan.basketballapp.service.PlayerService;
import com.ihsan.basketballapp.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/player")
public class PlayerController {
    private final PlayerService playerService;

    // http://localhost:9090/player/save?fullName=IHSANCAN&team=Bucks&number=14&position=C&height=182&weight=90&country=Turkey
    @GetMapping("/save")
    public ResponseEntity<Player> save(String fullName, String team, int number, String position, int height, int weight, String country){

        Player player = playerService.save(Player.builder()
                .fullName(fullName)
                .team(playerService.parseTeamName(team))
                .number(number)
                .position(position)
                .height(height)
                .weight(weight)
                .country(country).build());

        return ResponseEntity.ok(player);
    }

    @PostMapping(value="/save2")
    public ResponseEntity<Player> save2(@RequestBody String fullName){

        Player player = playerService.save(Player.builder()
                .fullName(fullName).build());

        return ResponseEntity.ok(player);
    }

    //  http://localhost:9090/player/findAll
    @GetMapping("/findAll")
    public ResponseEntity<List<Player>> findAll(){

        return ResponseEntity.ok(playerService.findAll());
    }

}
