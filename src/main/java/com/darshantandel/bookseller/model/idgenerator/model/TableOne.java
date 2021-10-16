package com.darshantandel.bookseller.model.idgenerator.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "table_one")
public class TableOne {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "table_one_generator")
    @SequenceGenerator(name = "table_one_generator", sequenceName = "table_one_id", allocationSize = 1)

    private Long id;

    private String name;
}
