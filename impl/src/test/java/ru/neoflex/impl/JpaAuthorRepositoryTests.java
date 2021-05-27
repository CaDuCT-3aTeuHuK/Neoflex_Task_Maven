package ru.neoflex.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.neoflex.impl.model.Author;
import ru.neoflex.impl.service.AuthorService;


import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class JpaAuthorRepositoryTests {

    @Autowired
    private AuthorService authorService;

    @Test
    public void findAllTest() {
        List<Author> authors = authorService.findAll();
        assertTrue(authors.size() > 0);
    }

    @Test
    public void findByIdTest() {
        Author authors = authorService.findById(1);
        assertEquals("Adolf Hitler", authors.getFullName());
    }

    @Test
    public void doNothingTest() {
        int doNothing = authorService.doNothing();
        assertEquals(101, doNothing);
    }


}
