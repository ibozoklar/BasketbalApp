package com.ihsan.basketballapp.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tbl_player")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private   Long id;

    private  String fullName;

    @OneToOne
    @JoinColumn(name = "team_id")
    private Team team;

    private int number;

    private String position;

    private int height;

    private int weight;

    private String country;
}
