package com.ihsan.basketballapp.utility;

import com.ihsan.basketballapp.repository.IMatchRepository;
import com.ihsan.basketballapp.repository.IPlayerRepository;
import com.ihsan.basketballapp.repository.ITeamRepository;
import com.ihsan.basketballapp.repository.entity.Match;
import com.ihsan.basketballapp.repository.entity.Player;
import com.ihsan.basketballapp.repository.entity.Team;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

@RequiredArgsConstructor
@Component
public class DataImpl {


    private final IPlayerRepository playerRepository;
    private final ITeamRepository teamRepository;
    private final IMatchRepository matchRepository;

    @PostConstruct
    private void create(){
        saveTeams();
        savePlayers();
        saveMatches();
    }


    Team team1 = Team.builder().name("Lakers").city("LosAngeles").build();
    Team team2 = Team.builder().name("Nets").city("Brooklyn").build();
    Team team3 = Team.builder().name("Bucks").city("Milwakuee").build();
    Team team4 = Team.builder().name("Nuggets").city("Denver").build();
    Team team5 = Team.builder().name("Warriors").city("Golden State").build();
    Team team6 = Team.builder().name("Celtics").city("Boston").build();
    Team team7 = Team.builder().name("Heat").city("Miami").build();
    Team team8 = Team.builder().name("Bulls").city("Chicago").build();
    Team team9 = Team.builder().name("Mavericks").city("Dallas").build();
    Team team10 = Team.builder().name("Grizzlies").city("Memphis").build();

    private void saveTeams(){

        teamRepository.saveAll(Arrays.asList(team1, team2, team3, team4, team5, team6, team7, team8, team9, team10));
    }

    private void savePlayers() {

        Player player1 = Player.builder()
                .fullName("LeBron James")
                .team(team1)
                .number(6)
                .position("SF")
                .height(206)
                .weight(113)
                .country("USA").build();

        Player player2 = Player.builder()
                .fullName("Kevin Durant")
                .team(team2)
                .number(7)
                .position("SF")
                .height(208)
                .weight(109)
                .country("USA").build();

        Player player3 = Player.builder()
                .fullName("Giannis Antetokounmpo")
                .team(team3)
                .number(34)
                .position("PF")
                .height(211)
                .weight(110)
                .country("Greece").build();


        Player player4 = Player.builder()
                .fullName("Nikola Jokic")
                .team(team4)
                .number(15)
                .position("C")
                .height(211)
                .weight(129)
                .country("Serbia").build();

        Player player5 = Player.builder()
                .fullName("Stephen Curry")
                .team(team5)
                .number(30)
                .position("PG")
                .height(188)
                .weight(84)
                .country("USA").build();

        Player player6 = Player.builder()
                .fullName("Jayson Tatum")
                .team(team6)
                .number(0)
                .position("PF")
                .height(203)
                .weight(95)
                .country("USA").build();

        Player player7 = Player.builder()
                .fullName("Jimmy Buttler")
                .team(team7)
                .number(22)
                .position("SF")
                .height(201)
                .weight(104)
                .country("USA").build();

        Player player8 = Player.builder()
                .fullName("Zach Lavine")
                .team(team8)
                .number(8)
                .position("SG")
                .height(196)
                .weight(91)
                .country("USA").build();

        Player player9 = Player.builder()
                .fullName("Luka Doncic")
                .team(team9)
                .number(77)
                .position("PG")
                .height(201)
                .weight(104)
                .country("Slovenia").build();

        Player player10 = Player.builder()
                .fullName("Ja Morant")
                .team(team10)
                .number(12)
                .position("PG")
                .height(191)
                .weight(89)
                .country("USA").build();

        playerRepository.saveAll(Arrays.asList(player1, player2, player3, player4, player5, player6, player7, player8, player9, player10));
    }

    private void saveMatches(){

        Match match1 = Match.builder()
                .homeTeam(team1)
                .awayTeam(team2)
                .matchDate(LocalDate.of(2023, Month.JANUARY, 8))
                .winnerTeam(team1).build();

        Match match2 = Match.builder()
                .homeTeam(team3)
                .awayTeam(team4)
                .matchDate(LocalDate.of(2023, Month.MAY, 14))
                .winnerTeam(team3).build();


        Match match3 = Match.builder()
                .homeTeam(team5)
                .awayTeam(team6)
                .matchDate(LocalDate.of(2023, Month.MARCH, 11))
                .winnerTeam(team6).build();

        Match match4 = Match.builder()
                .homeTeam(team7)
                .awayTeam(team8)
                .matchDate(LocalDate.of(2023, Month.FEBRUARY, 1))
                .winnerTeam(team8).build();

        Match match5 = Match.builder()
                .homeTeam(team9)
                .awayTeam(team10)
                .matchDate(LocalDate.of(2023, Month.MAY, 10))
                .winnerTeam(team9).build();

        matchRepository.saveAll(Arrays.asList(match1, match2, match3, match4, match5));
    }




}

