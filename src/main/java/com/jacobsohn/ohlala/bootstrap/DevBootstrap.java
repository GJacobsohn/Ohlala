package com.jacobsohn.ohlala.bootstrap;

import com.jacobsohn.ohlala.model.Article;
import com.jacobsohn.ohlala.repositiories.ArticleRepository;
import com.jacobsohn.ohlala.repositiories.AuthorRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    ArticleRepository articleRepository;
    AuthorRepository authorRepository;

    public DevBootstrap(ArticleRepository articleRepository, AuthorRepository authorRepository) {
        this.articleRepository = articleRepository;
        this.authorRepository = authorRepository;
    }


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        Article article = new Article();
        article.setTitle("A cool Article");
        article.setIntro("Intro for this article");
        article.setText("A looooooonnggg loooooonnnnggg Text!");
        article.setSlag("A cool Article");
        articleRepository.save(article);


        article = new Article();
        article.setTitle("A second cool Article");
        article.setIntro("Intro for another article");
        article.setText("A looooooonnggg loooooonnnnggg Text!");
        article.setSlag("A cool Article");
        articleRepository.save(article);

    }
}
