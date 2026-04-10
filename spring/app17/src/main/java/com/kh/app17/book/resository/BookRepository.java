package com.kh.app17.book.resository;

import com.kh.app17.book.dto.response.BookResponseDto;
import com.kh.app17.book.entity.BookEntity;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BookRepository {
    private final EntityManager em;


    public void save(BookEntity dto) {
        em.persist(dto);
    }

    public List<BookEntity> findAll() {
        String jpql = """
                        select b from BookEntity b where b.delYn = 'N' order by b.id desc
                        """;
        return em.createQuery(jpql, BookEntity.class).getResultList();
    }

    public BookEntity findById(Long id) {
        String jpql = """
                        select b from BookEntity b where b.id = :id and b.delYn = 'N' 
                        """;
        return em.createQuery(jpql, BookEntity.class)
                .setParameter("id",id)
                .getSingleResult();
    }
}
