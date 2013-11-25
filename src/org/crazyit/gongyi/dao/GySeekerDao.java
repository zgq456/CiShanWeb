package org.crazyit.gongyi.dao;

import java.util.List;

import org.crazyit.gongyi.module.GySeeker;

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
public interface GySeekerDao {
	/**
	 * 根据id查找
	 * 
	 * @param id
	 *            需要查找的id
	 */
	GySeeker get(Integer id);

	/**
	 * 增加
	 * 
	 * @param seeker
	 *            需要增加的
	 */
	void save(GySeeker seeker);

	/**
	 * 修改
	 * 
	 * @param seeker
	 *            需要修改的
	 */
	void update(GySeeker seeker);

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
	 * @param seeker
	 *            需要删除的
	 */
	void delete(GySeeker seeker);

	/**
	 * 查询全部
	 * 
	 * @return 获得全部
	 */
	List<GySeeker> findAll();

}