package ru.neoflex.impl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.neoflex.api.serviceinterface.AuthorServiceInterface;
import ru.neoflex.api.serviceinterface.SimpleClassForGetOneHundred;
import ru.neoflex.impl.model.Author;
import ru.neoflex.impl.repository.AuthorJpaRepository;


import java.util.List;

@Service
public class AuthorService implements AuthorServiceInterface {
    private final AuthorJpaRepository authorJpaRepository;

    public AuthorService(AuthorJpaRepository authorJpaRepository){
        this.authorJpaRepository=authorJpaRepository;
    }

    public List<Author> findAll() {
        return authorJpaRepository.findAll();
    }

    public Author findById(Integer id) {
        return authorJpaRepository
                .findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Cannot find employee by ID - " + id));
    }


    public int doNothing() {
        SimpleClassForGetOneHundred simpleClassForGetOneHundred = new SimpleClassForGetOneHundred();
        return 1+simpleClassForGetOneHundred.ovt();
    }


}
