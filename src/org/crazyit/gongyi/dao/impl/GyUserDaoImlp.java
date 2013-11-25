package org.crazyit.gongyi.dao.impl;

import java.util.List;

import org.crazyit.gongyi.dao.GyUserDao;
import org.crazyit.gongyi.module.GyUser;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class GyUserDaoImlp extends HibernateDaoSupport implements GyUserDao {

	@Override
	public GyUser get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(GyUser user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(GyUser user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(GyUser user) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<GyUser> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GyUser findUserByNameAndPass(String username, String pass) {
		// TODO Auto-generated method stub
		return null;
	}

}
