package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entities.Books;
import com.examples.demo.repositories.BooksRepository;

@Controller
public class StudentController {
	
	@Autowired
	private BooksRepository booksRepository;
	
	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Books> getAllBooks() {
		return booksRepository.findAll();
	}

	public BooksRepository getBooksRepository() {
		return booksRepository;
	}

	public void setBooksRepository(BooksRepository booksRepository) {
		this.booksRepository = booksRepository;
	}

}
