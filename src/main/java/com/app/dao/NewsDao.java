package com.app.dao;

import java.util.ArrayList;
import java.util.List;

import com.app.model.News;

public interface NewsDao 
{
	//查询当月最新的10条新闻纪录
	public ArrayList<News> selectCurMonthListNews();
	
	//查询上个月最新的10条新闻纪录
	public List<News> selectPreMonthListNews();
	
	//新增新闻
	public boolean addNews(News news);
	
	//更新新闻
	public boolean updateNews(News news);
	
}