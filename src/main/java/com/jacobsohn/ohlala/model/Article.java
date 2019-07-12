package com.jacobsohn.ohlala.model;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;
    private String slag;
    private String intro;
    private String text;

    @ManyToMany(mappedBy = "articles")
    private Set<Author> authors = new HashSet<>();


    public void setId(long id) {
        this.id = id;
    }

    public String getSlag() {
        return slag;
    }

    public void setSlag(String slag) {
        this.slag = slag;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAuthor(Set<Author> authors) {
        this.authors = authors;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getIntro() {
        return intro;
    }

    public String getText() {
        return text;
    }

    public Set<Author> getAuthor() {
        return authors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Article)) return false;
        Article article = (Article) o;
        return getId() == article.getId();
    }
}
