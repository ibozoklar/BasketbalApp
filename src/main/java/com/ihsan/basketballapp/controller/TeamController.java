package com.ihsan.basketballapp.controller;

import com.ihsan.basketballapp.repository.entity.Player;
import com.ihsan.basketballapp.repository.entity.Team;
import com.ihsan.basketballapp.service.PlayerService;
import com.ihsan.basketballapp.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/team")
public class TeamController {

    private final TeamService teamService;


    @GetMapping("/save")
    public ResponseEntity<Team> save(String name, String city){

        Team team = teamService.save(Team.builder().name(name).city(city).build());

        return ResponseEntity.ok(team);
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Team>> findAll(){

        return ResponseEntity.ok(teamService.findAll());
    }
}
