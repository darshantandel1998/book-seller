package com.darshantandel.bookseller.model.idgenerator.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "default_one")
public class DefaultOne {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
}
