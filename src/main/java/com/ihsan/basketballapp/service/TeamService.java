package com.ihsan.basketballapp.service;


import com.ihsan.basketballapp.repository.IPlayerRepository;
import com.ihsan.basketballapp.repository.ITeamRepository;
import com.ihsan.basketballapp.repository.entity.Player;
import com.ihsan.basketballapp.repository.entity.Team;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeamService {

    private final ITeamRepository teamRepository;


    public Team save(Team team){

        return teamRepository.save(team);
    }

    public List<Team> findAll(){
        return teamRepository.findAll();
    }

}
