package com.andreichristian.spring6webapp.services;

import com.andreichristian.spring6webapp.domain.Author;

public interface AuthorService {



    Iterable<Author> findAll();

}
