package com.kh.app15Book.book;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Setter
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
        return new BookEntity(title , price);
    }

    public static BookDto from(BookEntity entity){
        if(entity == null){
            return null;
        }
        BookDto dto = new BookDto();
        dto.setId(entity.getId());
        dto.setTitle(entity.getTitle());
        dto.setPrice(entity.getPrice());
        dto.setCreatedAt(entity.getCreatedAt());
        dto.setModifiedAt(entity.getModifiedAt());
        dto.setDelYn(entity.getDelYn());
        return dto;
    }

}