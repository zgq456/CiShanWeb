package org.crazyit.gongyi.servlet.base;

import javax.servlet.*;
import javax.servlet.http.*;

import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.context.ApplicationContext;

public class BaseServlet extends HttpServlet {
	private ApplicationContext ctx;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		// 获取Web应用中的ApplicationContext实例
		ctx = WebApplicationContextUtils
				.getWebApplicationContext(getServletContext());
	}

	// 返回Web应用中的Spring容器
	public ApplicationContext getCtx() {
		return this.ctx;
	}
}