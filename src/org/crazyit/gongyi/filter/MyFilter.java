package org.crazyit.gongyi.filter;


import java.io.IOException;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;

/**
 * Servlet Filter implementation class MyFilter
 */
@WebFilter(urlPatterns = "/*")
public class MyFilter implements Filter {

    /**
     * Default constructor. 
     */
    public MyFilter() {
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String servletPath = ((HttpServletRequest)request).getRequestURI();  
        if(!StringUtils.endsWithIgnoreCase(servletPath, ".gif")  
            && !StringUtils.endsWithIgnoreCase(servletPath, ".js")  
            && !StringUtils.endsWithIgnoreCase(servletPath, ".css")  
            ) {  
            System.out.println("###############servletPath:" + servletPath);  
            printParams(request);  
        }  
        
        
        HttpSession session = ((HttpServletRequest) request).getSession(true);
        session.setAttribute("userId", "zgq"); //FIXME
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
	}
	
	private void printParams(ServletRequest request) {  
        System.out.println("################################################");  
          
        Set<Entry<String, String[]>> entrySet = request.getParameterMap().entrySet();  
//        Iterator<Entry> entryIt = entrySet.iterator();  
        for (Entry oneEnt : entrySet) {  
            Object oneEntKey = oneEnt.getKey();  
            Object oneEntValueObj = oneEnt.getValue();  
            String[] oneEntValue = new String[1];  
            StringBuffer oneEntValueStr = new StringBuffer();  
              
            if (oneEntValueObj instanceof String[]) {  
                oneEntValue = (String[])oneEntValueObj;  
            }  
            else {  
                oneEntValue[0] = oneEntValueObj.toString();  
            }  
              
            for (int k = 0; k < oneEntValue.length; k++) {  
                oneEntValueStr.append(oneEntValue[k]);  
            }  
              
            System.out.println("###param name:" + oneEntKey + " value:"  
                + oneEntValueStr);  
        }  
        System.out.println("################################################");  
    }  

}
