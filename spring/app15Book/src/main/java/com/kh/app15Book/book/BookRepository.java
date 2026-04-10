package com.kh.app15Book.book;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
@Slf4j
public class BookRepository {

    private final EntityManager em;

    public void save(BookEntity entity) {
        em.persist(entity);
    }

    public BookEntity findById(Long id) {
        return em
                .createQuery("""
                        select b
                        from BookEntity b
                        where b.id = :id
                        and b.delYn = 'N'
                    """, BookEntity.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    public List<BookEntity> findAll(){
        return em.createQuery(
                "select b from BookEntity b where b.delYn = 'N' order by b.id desc",
                BookEntity.class
        ).getResultList();
    }

    public void delete(BookEntity entity) {
        em.remove(entity);
    }
}