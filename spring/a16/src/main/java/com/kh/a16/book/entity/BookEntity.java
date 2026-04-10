package com.kh.a16.book.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "BOOK")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@ToString
public class BookEntity {



    @Id
    @SequenceGenerator(name = "book_seq_gen", sequenceName = "SEQ_BOOK", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_seq_gen")
    private Long id;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(nullable = false)
    private Integer price;

    @Builder.Default
    @Column(length = 1, nullable = false)
    private String delYn = "N";

    @Builder.Default
    private LocalDateTime createdAt = LocalDateTime.now();

    private LocalDateTime modifiedAt;

    public void change(String title, Integer price){
        this.title = title;
        this.price = price;
    }

}
