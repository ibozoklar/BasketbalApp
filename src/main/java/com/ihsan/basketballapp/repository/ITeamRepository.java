package com.ihsan.basketballapp.repository;

import com.ihsan.basketballapp.repository.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITeamRepository extends JpaRepository<Team,Long> {


}
