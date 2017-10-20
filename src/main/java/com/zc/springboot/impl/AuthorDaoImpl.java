package com.zc.springboot.impl;

import com.zc.springboot.Dao.AuthorDao;
import com.zc.springboot.entity.Author;

import java.util.List;

public class AuthorDaoImpl implements AuthorDao {
    @Override
    public int add(Author author) {
        return 0;
    }

    @Override
    public int update(Author author) {
        return 0;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

    @Override
    public Author findAuthor(Long id) {
        return null;
    }

    @Override
    public List<Author> findAuthorList() {
        return null;
    }
}
