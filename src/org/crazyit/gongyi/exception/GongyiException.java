package org.crazyit.gongyi.exception;

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
	
	public GongyiException(String message, Throwable cause)
	{
		super(message, cause);
	}
}
