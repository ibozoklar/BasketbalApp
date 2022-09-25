package com.ihsan.basketballapp.repository;

import com.ihsan.basketballapp.repository.entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMatchRepository extends JpaRepository<Match,Long> {
}
