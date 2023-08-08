package com.andreichristian.spring6webapp.services;

import com.andreichristian.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();

}
