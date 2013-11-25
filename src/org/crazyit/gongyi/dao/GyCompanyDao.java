package org.crazyit.gongyi.dao;

import java.util.List;

import org.crazyit.gongyi.module.GyCompany;

/**
 * Description: <br/>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> <br/>
 * Copyright (C), 2001-2010, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public interface GyCompanyDao {
	/**
	 * 根据id查找
	 * 
	 * @param id
	 *            需要查找的id
	 */
	GyCompany get(Integer id);

	/**
	 * 增加
	 * 
	 * @param company
	 *            需要增加的
	 */
	void save(GyCompany company);

	/**
	 * 修改
	 * 
	 * @param company
	 *            需要修改的
	 */
	void update(GyCompany company);

	/**
	 * 删除
	 * 
	 * @param id
	 *            需要删除的id
	 */
	void delete(Integer id);

	/**
	 * 删除
	 * 
	 * @param company
	 *            需要删除的
	 */
	void delete(GyCompany company);

	/**
	 * 查询全部
	 * 
	 * @return 获得全部
	 */
	List<GyCompany> findAll();

}