package com.barbershop.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity //Define que é uma entidade de uma tabela
@Data //boilerplate para getters setters constructors
@Table(name = "client")
public class ClientModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nome;
    @Column
    private String email;
}
