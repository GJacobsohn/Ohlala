package com.jacobsohn.ohlala.repositiories;

import com.jacobsohn.ohlala.model.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {

}
