package org.crazyit.gongyi.exception;

public class GongyiException extends RuntimeException
{
	//����һ���޲����Ĺ�����
	public GongyiException()
	{
	}
	//����һ����message�����Ĺ������
	public GongyiException(String message)
	{
		super(message);
	}
	
	public GongyiException(String message, Throwable cause)
	{
		super(message, cause);
	}
}
