package com.ihsan.basketballapp.repository;

import com.ihsan.basketballapp.repository.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPlayerRepository extends JpaRepository<Player,Long> {
}
