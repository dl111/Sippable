package com.sippable.dao;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

import com.sippable.beans.Article;
import com.sippable.utils.HibernateUtil;

@Component
public class ArticleDaoImpl implements ArticleDao {

	@Override
	public void ArticleUpdate(Article article) {
		
		
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		session.merge(article);
		session.getTransaction().commit();
	}

	@Override
	public void CreateNewArticle(Article article) {

		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		session.save(article);
		session.getTransaction().commit();
		
	}

	@Override
	public Article ReturnArticle(Integer aid) {
		
		
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		Article temp = (Article)session.get(Article.class, aid);
		session.getTransaction().commit();
			return temp;
	}

	@Override
	public List<Article> GetAllEmployeeArticles(Integer userid) {
		
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		Query employeeArticles = session.createQuery("from articles where employee_id = :F");
		employeeArticles.setParameter("F", userid);
		List<Article> temp = employeeArticles.list();
		session.getTransaction().commit();
		return temp;
	}

}
