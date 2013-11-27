package org.crazyit.gongyi.dao;

import java.util.List;

import org.crazyit.gongyi.module.GyUser;

/**
 * Description: <br/>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
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
	 * ����id�����û�
	 * 
	 * @param id
	 *            ��Ҫ���ҵ��û�id
	 */
	GyUser get(Integer id);

	/**
	 * �����û�
	 * 
	 * @param user
	 *            ��Ҫ���ӵ��û�
	 */
	void save(GyUser user);

	/**
	 * �޸��û�
	 * 
	 * @param user
	 *            ��Ҫ�޸ĵ��û�
	 */
	void update(GyUser user);

	/**
	 * ɾ���û�
	 * 
	 * @param id
	 *            ��Ҫɾ�����û�id
	 */
	void delete(Integer id);

	/**
	 * ɾ���û�
	 * 
	 * @param user
	 *            ��Ҫɾ�����û�
	 */
	void delete(GyUser user);

	/**
	 * ��ѯȫ���û�
	 * 
	 * @return ���ȫ���û�
	 */
	List<GyUser> findAll();

	/**
	 * �����û�������������û�
	 * 
	 * @param username
	 *            ��ѯ������û���
	 * @param pass
	 *            ��ѯ���������
	 * @return ָ���û����������Ӧ���û�
	 */
	GyUser findUserByNameAndPass(String username, String pass);
}