package org.crazyit.gongyi.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.crazyit.gongyi.business.SeekerBean;
import org.crazyit.gongyi.service.GongyiManager;
import org.crazyit.gongyi.service.impl.GongyiManagerImpl;
import org.crazyit.gongyi.servlet.base.BaseServlet;
import org.json.JSONArray;

/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a> 
 * <br/>Copyright (C), 2001-2012, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
@WebServlet(urlPatterns="/android/viewSeekList.jsp")
public class ViewSeekListServlet extends BaseServlet
{
    public void service(HttpServletRequest request , 
		HttpServletResponse response)
		throws IOException , ServletException
	{
//		Integer userId = (Integer)request.getSession(true)
//			.getAttribute("userId");
		// ��ȡҵ���߼����
		GongyiManager gyMgr = (GongyiManager)getCtx().getBean("mgr");
		List<SeekerBean> seekList = gyMgr.getSeekList();
		JSONArray jsonArr= new JSONArray(seekList);
		response.setContentType("text/html; charset=GBK");
		response.getWriter().println(jsonArr.toString());
	}
}