package com.zc.springboot.Dao;

import com.zc.springboot.entity.Author;

import java.util.List;

public interface AuthorDao {

    int add(Author author);
    int update(Author author);
    int delete(Long id);
    Author findAuthor(Long id);
    List<Author> findAuthorList();
}
