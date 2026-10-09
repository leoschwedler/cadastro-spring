package com.developerswd.developerswd;

import jakarta.persistence.*;

@Entity
@Table(name = "Ninja")
public class Ninja {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idNinja;
    private String name;
    private String email;
    private int idade;



}
