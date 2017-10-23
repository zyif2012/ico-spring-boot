package cn.ico.boot.controller;

import cn.ico.boot.domain.Article;
import cn.ico.boot.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("user")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @GetMapping("articles")
    public List<Article> getAllArticles() {
        List<Article> list = articleService.getAllArticles();
        return list;
    }
}