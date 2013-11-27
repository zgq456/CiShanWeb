package org.crazyit.gongyi.action.base;

import org.crazyit.gongyi.service.GongyiManager;

import com.opensymphony.xwork2.ActionSupport;
/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a> 
 * <br/>Copyright (C), 2001-2010, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class BaseAction extends ActionSupport
{
	protected GongyiManager mgr;

	public void setMgr(GongyiManager mgr)
	{
		this.mgr = mgr;
	}
}