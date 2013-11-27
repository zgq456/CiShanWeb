package org.crazyit.gongyi.servlet.base;

import javax.servlet.*;
import javax.servlet.http.*;

import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.context.ApplicationContext;

public class BaseServlet extends HttpServlet {
	private ApplicationContext ctx;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		// ��ȡWebӦ���е�ApplicationContextʵ��
		ctx = WebApplicationContextUtils
				.getWebApplicationContext(getServletContext());
	}

	// ����WebӦ���е�Spring����
	public ApplicationContext getCtx() {
		return this.ctx;
	}
}