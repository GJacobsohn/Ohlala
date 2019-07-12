package com.jacobsohn.ohlala.repositiories;

import com.jacobsohn.ohlala.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
