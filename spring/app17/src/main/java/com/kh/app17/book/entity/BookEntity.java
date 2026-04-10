package com.kh.app17.book.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name ="BOOK")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class BookEntity {

    @Id
    @GeneratedValue(generator = "book_seq_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="book_seq_gen", sequenceName = "SEQ_BOOK", allocationSize = 1)
    private Long id;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(nullable = false)
    private Integer price;

    @Builder.Default
    private LocalDateTime createdAt = LocalDateTime.now();

    private LocalDateTime modifiedAt;

    @Builder.Default
    @Column(length = 1, nullable = false)
    private String delYn = "N";

    public void delete(){
        this.delYn = "Y";
        this.modifiedAt = LocalDateTime.now();
    }

    public void change(String title, Integer price){
        this.title = title;
        this.price = price;
        this.modifiedAt = LocalDateTime.now();
    }

}
