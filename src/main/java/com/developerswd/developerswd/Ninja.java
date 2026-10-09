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

    public Long getIdNinja() {
        return idNinja;
    }

    public void setIdNinja(Long idNinja) {
        this.idNinja = idNinja;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
