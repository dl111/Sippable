package com.sippable.service;

import java.util.List;

import org.hibernate.type.AdaptedImmutableType;

import com.sippable.beans.Article;
import com.sippable.dao.ArticleDaoImpl;

public class ArticleServiceImpl implements ArticleService {

	ArticleDaoImpl Ad = new ArticleDaoImpl();
	
	@Override
	public void ArticleUpdate(Article article) {
		
		Ad.ArticleUpdate(article);
	}

	@Override
	public void CreateNewArticle(Article article) {
		
		Ad.CreateNewArticle(article);
	}

	@Override
	public Article ReturnArticle(Integer aid) {
		
		Article temp = Ad.ReturnArticle(aid);
		return temp;
	}

	@Override
	public List<Article> GetAllEmployeeArticles(Integer userid) {
		
		List<Article> temp =Ad.GetAllEmployeeArticles(userid);
		return temp;
	}

}
