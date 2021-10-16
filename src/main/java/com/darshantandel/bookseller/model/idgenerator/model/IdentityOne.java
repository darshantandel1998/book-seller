package com.darshantandel.bookseller.model.idgenerator.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "identity_one")
public class IdentityOne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
