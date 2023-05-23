package com.example.lab4.services;

import com.example.lab4.entity.Book;
import com.example.lab4.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class BookService {
    @Autowired
    private IBookRepository bookRepository;
    public List<Book> GetAllBooks(){
        return bookRepository.findAll();
    }
    public Book getBookById(Long id){
        return bookRepository.findById(id).orElse(null);
    }
    //public void  addBook(Book book){
    //bookRepository.save(book);
    //}
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
    public Book getBookBtId(Long id){
        return bookRepository.findById(id).orElse(null);
    }
    public void addBook(Book book){
        bookRepository.save(book);
    }
    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }
    public void updateBook(Book book){
        bookRepository.save(book);
    }

}
