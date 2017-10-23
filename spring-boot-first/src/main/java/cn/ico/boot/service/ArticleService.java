package cn.ico.boot.service;

import cn.ico.boot.domain.Article;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleService {
    public List<Article> getAllArticles(){
        List<Article> list = new ArrayList<Article>();
        list.add(new Article(1, "Java Concurrency", "Java"));
        list.add(new Article(2, "Hibernate HQL", "Hibernate"));
        list.add(new Article(3, "Spring MVC with Hibernate", "Spring"));
        return list;
    }
}