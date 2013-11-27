package org.crazyit.gongyi.dao.impl;

import java.util.List;

import org.crazyit.gongyi.dao.GySeekerDao;
import org.crazyit.gongyi.module.GySeeker;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class GySeekerDaoImpl extends HibernateDaoSupport implements GySeekerDao {

	@Override
	public GySeeker get(Integer id) {
		return (GySeeker) getHibernateTemplate().get(GySeeker.class, id);
	}

	@Override
	public void save(GySeeker seeker) {
		getHibernateTemplate().save(seeker);
	}

	@Override
	public void update(GySeeker seeker) {
		getHibernateTemplate().saveOrUpdate(seeker);
	}

	@Override
	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}

	@Override
	public void delete(GySeeker seeker) {
		getHibernateTemplate().delete(seeker);

	}

	@Override
	public List<GySeeker> findAll() {
		return (List<GySeeker>) getHibernateTemplate().find("from GySeeker where recStatus = 1");
	}

}
