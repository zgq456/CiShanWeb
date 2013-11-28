package org.crazyit.gongyi.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.crazyit.gongyi.business.SeekerBean;
import org.crazyit.gongyi.dao.GySeekerDao;
import org.crazyit.gongyi.exception.GongyiException;
import org.crazyit.gongyi.module.GySeeker;
import org.crazyit.gongyi.service.GongyiManager;

public class GongyiManagerImpl implements GongyiManager {
	static Logger log = Logger.getLogger(GongyiManagerImpl.class.getName());
	private GySeekerDao seekerDao;

	public GySeekerDao getSeekerDao() {
		return seekerDao;
	}

	public void setSeekerDao(GySeekerDao seekerDao) {
		this.seekerDao = seekerDao;
	}

	public List<SeekerBean> getSeekList() {
		try {
			List<GySeeker> seeks = seekerDao.findAll();
			List<SeekerBean> result = new ArrayList<SeekerBean>();
			for (GySeeker seek : seeks) {
				SeekerBean sb = new SeekerBean();
				initSeek(sb, seek);
				result.add(sb);
			}
			return result;
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new GongyiException("��ѯ�������û������쳣,������", e);
		}
	}

	/**
	 * ��һ��Seek POת����SeekBean��VO
	 * 
	 * @param seekBean
	 *            ItemBean��VO
	 * @param seekPO
	 *            Item��PO
	 */
	private void initSeek(SeekerBean seekBean, GySeeker seekPO) {
		seekBean.setId(seekPO.getSeekerId());
		seekBean.setSeekerName(seekPO.getSeekerName());
		seekBean.setSeekerAddr(seekPO.getSeekerAddr());
		seekBean.setSeekerDesc(seekPO.getSeekerDesc());
		seekBean.setNeedAmount(seekPO.getNeedAmount());
		seekBean.setHelpAmount(seekPO.getHelpAmount());
		seekBean.setHelpCount(seekPO.getHelpCount());
		seekBean.setBrowseCount(seekPO.getBrowseCount());
		seekBean.setCreateDate(seekPO.getCreateDate());
		seekBean.setDoneDate(seekPO.getDoneDate());
		if (seekPO.getSeekerProv() != null) {
			seekBean.setSeekerProv(seekPO.getSeekerProv().getProvName());
		}
		if (seekPO.getSeekerZone() != null) {
			seekBean.setSeekerZone(seekPO.getSeekerZone().getZoneName());
		}
		if (seekPO.getSeekerAd() != null) {
			seekBean.setSeekerAdId(seekPO.getSeekerAd().getAdId());
		}
	}

}
