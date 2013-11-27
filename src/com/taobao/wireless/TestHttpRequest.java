package com.taobao.wireless;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
/**
 * 
 * @author Administrator
 *
 */
public class TestHttpRequest {
	
	public static HttpClient httpClient = new DefaultHttpClient();
	
	@Test
	public void test_001() throws Exception{

		// ����HttpGet����
		HttpGet get = new HttpGet("http://www.baidu.com");
		// ����GET����
		HttpResponse httpResponse = httpClient.execute(get);
		// ����������ɹ��ط�����Ӧ
		if (httpResponse.getStatusLine()
			.getStatusCode() == 200)
		{
			// ��ȡ��������Ӧ�ַ���
			String result = EntityUtils
				.toString(httpResponse.getEntity());
			System.out.println(result);;
		}
	
	}

}
