package com.kh.app14.book;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "Book")
@Setter
@Getter
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "abc")
    @SequenceGenerator(name = "abc" ,allocationSize = 1, sequenceName = "SEQ_BOOK")
    private Long id;

    private String title;
    private String author;
    private Integer price;
}
