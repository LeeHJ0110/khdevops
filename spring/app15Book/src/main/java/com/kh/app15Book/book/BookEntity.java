package com.kh.app15Book.book;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "BOOK")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class BookEntity {

    public BookEntity(String title , Integer price) {
        this.title = title;
        this.price = price;
        this.delYn = "N";
        this.createdAt = LocalDateTime.now();
    }

    public void delete() {
        this.delYn = "Y";
        this.modifiedAt = LocalDateTime.now();
    }

    public void update(String title , Integer price){
        if(title == null || title.isEmpty()){
            updatePrice(price);
            return;
        }
        if(price == null || price < 0){
            updateTitle(title);
            return;
        }
        this.title = title;
        this.price = price;
        this.modifiedAt = LocalDateTime.now();
    }

    public void updateTitle(String title){
        this.title = title;
        this.modifiedAt = LocalDateTime.now();
    }
    public void updatePrice(Integer price){
        this.price = price;
        this.modifiedAt = LocalDateTime.now();
    }


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "abc")
    @SequenceGenerator(name = "abc" ,sequenceName = "SEQ_BOOK" , allocationSize = 1)
    private Long id;

    @Column(length = 100 , nullable = false)
    private String title;

    @Column(nullable = false)
    private Integer price;

    @Column(length = 1, nullable = false)
    private String delYn;

    private LocalDateTime createdAt;

    private LocalDateTime modifiedAt;

}