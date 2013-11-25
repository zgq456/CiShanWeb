package org.crazyit.gongyi.dao;

import java.util.List;

import org.crazyit.auction.model.*;
import org.crazyit.auction.business.*;
import org.crazyit.gongyi.module.GyUser;

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
public interface GyUserDao {
	/**
	 * 根据id查找用户
	 * 
	 * @param id
	 *            需要查找的用户id
	 */
	GyUser get(Integer id);

	/**
	 * 增加用户
	 * 
	 * @param user
	 *            需要增加的用户
	 */
	void save(GyUser user);

	/**
	 * 修改用户
	 * 
	 * @param user
	 *            需要修改的用户
	 */
	void update(GyUser user);

	/**
	 * 删除用户
	 * 
	 * @param id
	 *            需要删除的用户id
	 */
	void delete(Integer id);

	/**
	 * 删除用户
	 * 
	 * @param user
	 *            需要删除的用户
	 */
	void delete(GyUser user);

	/**
	 * 查询全部用户
	 * 
	 * @return 获得全部用户
	 */
	List<GyUser> findAll();

	/**
	 * 根据用户名，密码查找用户
	 * 
	 * @param username
	 *            查询所需的用户名
	 * @param pass
	 *            查询所需的密码
	 * @return 指定用户名、密码对应的用户
	 */
	GyUser findUserByNameAndPass(String username, String pass);
}