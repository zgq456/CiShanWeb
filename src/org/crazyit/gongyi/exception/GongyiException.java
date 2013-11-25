package org.crazyit.gongyi.exception;

/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> 
 * <br/>Copyright (C), 2001-2010, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class GongyiException extends RuntimeException
{
	//定义一个无参数的构造器
	public GongyiException()
	{
	}
	//定义一个带message参数的构造参数
	public GongyiException(String message)
	{
		super(message);
	}
}
