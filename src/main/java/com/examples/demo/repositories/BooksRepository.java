package com.examples.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Books;

//@Repository
public interface BooksRepository extends CrudRepository<Books, Integer> {

}
