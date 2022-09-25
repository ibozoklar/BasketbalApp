package com.ihsan.basketballapp.service;

import com.ihsan.basketballapp.repository.IMatchRepository;
import com.ihsan.basketballapp.repository.entity.Match;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MatchService {

    private final IMatchRepository matchRepository;

    public Match save(Match match){

        return matchRepository.save(match);
    }

    public List<Match> findAll(){
        return matchRepository.findAll();
    }
}
