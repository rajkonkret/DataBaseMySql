package com.raj.DataBaseMySql.model;

import lombok.*;

import javax.persistence.*;

@Data
//@Getter - z @data te elementy będą i tak wygenerowane
@RequiredArgsConstructor
//@NoArgsConstructor
@AllArgsConstructor
//@Setter
//@ToString
@Entity
@Table(name = "books")
public class Book {

  //  @Getter - gdyby nie było adnotacji nad klasą
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;
    private String isbn;

  //  @Getter
    private String author;



}
