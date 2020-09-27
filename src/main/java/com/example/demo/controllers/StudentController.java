package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
	
	//@Autowired
	//private BooksRepository booksRepository;
	
	/*@GetMapping(path = "/all")
	public @ResponseBody Iterable<Books> getAllBooks() {
		return booksRepository.findAll();
	}*/
	@GetMapping(path = "/all")
	public String getAllBooks() {
		return "The controller invoked";
	}

	/*public BooksRepository getBooksRepository() {
		return booksRepository;
	}

	public void setBooksRepository(BooksRepository booksRepository) {
		this.booksRepository = booksRepository;
	}*/

}
