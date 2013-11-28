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

@WebServlet(urlPatterns="/android/viewSeekList.jsp")
public class ViewSeekListServlet extends BaseServlet
{
    public void service(HttpServletRequest request , 
		HttpServletResponse response)
		throws IOException , ServletException
	{
//		Integer userId = (Integer)request.getSession(true)
//			.getAttribute("userId");
		// 获取业务逻辑组件
		GongyiManager gyMgr = (GongyiManager)getCtx().getBean("mgr");
		List<SeekerBean> seekList = gyMgr.getSeekList();
		JSONArray jsonArr= new JSONArray(seekList);
		response.setContentType("text/html; charset=GBK");
		response.getWriter().println(jsonArr.toString());
	}
}