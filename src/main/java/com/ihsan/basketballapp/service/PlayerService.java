package com.ihsan.basketballapp.service;

import com.ihsan.basketballapp.repository.IPlayerRepository;
import com.ihsan.basketballapp.repository.ITeamRepository;
import com.ihsan.basketballapp.repository.entity.Player;
import com.ihsan.basketballapp.repository.entity.Team;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerService {

    private final IPlayerRepository playerRepository;
    private final ITeamRepository teamRepository;


    public Team parseTeamName(String teamName){

        List<Team> teams = teamRepository.findAll();

        for(int i=0; i < teams.size(); i++){
            if(teamName.equalsIgnoreCase(teams.get(i).getName())){
                return teams.get(i);
            }
        }
        return null;
    }

    public Player save(Player player){

        return playerRepository.save(player);
    }

    public List<Player> findAll(){
        return playerRepository.findAll();
    }
}
