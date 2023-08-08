package com.andreichristian.spring6webapp.repositories;

import com.andreichristian.spring6webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}

