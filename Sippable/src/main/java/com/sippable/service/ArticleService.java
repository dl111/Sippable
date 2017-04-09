package com.sippable.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sippable.beans.Article;

@Service
public interface ArticleService {

	public void ArticleUpdate(Article article);
	public void CreateNewArticle(Article article);
	public Article ReturnArticle(Integer aid);
	public List<Article> GetAllEmployeeArticles(Integer userid);
}
