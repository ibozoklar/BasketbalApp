package com.ihsan.basketballapp.controller;

import com.ihsan.basketballapp.repository.entity.Match;
import com.ihsan.basketballapp.repository.entity.Team;
import com.ihsan.basketballapp.service.MatchService;
import com.ihsan.basketballapp.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/match")
public class MatchController {

    private final MatchService MatchService;

    private final PlayerService playerService;

    @GetMapping("/save")
    public ResponseEntity<Match> save(String homeTeam, String awayTeam, String winnerTeam, String matchDate){

        Match match = MatchService.save(Match.builder()
                .homeTeam(playerService.parseTeamName(homeTeam))
                .awayTeam(playerService.parseTeamName(awayTeam))
                .winnerTeam(playerService.parseTeamName(winnerTeam))
                .matchDate(LocalDate.parse(matchDate)).build());

        return ResponseEntity.ok(match);
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Match>> findAll(){

        return ResponseEntity.ok(MatchService.findAll());
    }
}
