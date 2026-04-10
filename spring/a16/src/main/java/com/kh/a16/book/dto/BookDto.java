package com.kh.a16.book.dto;

import com.kh.a16.book.entity.BookEntity;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@ToString
public class BookDto {

    private Long id;
    private String title;
    private Integer price;
    private String delYn;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    public BookEntity toEntity(){
        return BookEntity
                .builder()
                .title(this.title)
                .price(this.price)
                .build();
    }

    public static BookDto from(BookEntity entity){
        BookDto dto = new BookDto();
        dto.id = entity.getId();
        dto.title = entity.getTitle();
        dto.price = entity.getPrice();
        dto.delYn = entity.getDelYn();
        dto.createdAt = entity.getCreatedAt();
        dto.modifiedAt = entity.getModifiedAt();
        return dto;
    }
}
