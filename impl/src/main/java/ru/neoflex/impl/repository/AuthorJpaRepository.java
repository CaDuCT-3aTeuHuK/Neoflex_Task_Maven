package ru.neoflex.impl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.neoflex.impl.model.Author;


@Repository
public interface AuthorJpaRepository extends JpaRepository<Author, Integer> {

}
