package com.ihsan.basketballapp.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tbl_team")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private   Long id;

    @Column(length = 50)
    private  String name;

    private String city;

}
