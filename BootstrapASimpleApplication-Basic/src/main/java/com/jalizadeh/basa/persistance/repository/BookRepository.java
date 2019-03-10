package com.jalizadeh.basa.persistance.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.jalizadeh.basa.persistance.entity.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}