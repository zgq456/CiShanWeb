package com.taobao.wireless;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

public class TestHttpRequest {
	
	public static HttpClient httpClient = new DefaultHttpClient();
	
	@Test
	public void test_001() throws Exception{

		// 创建HttpGet对象。
		HttpGet get = new HttpGet("http://www.baidu.com");
		// 发送GET请求
		HttpResponse httpResponse = httpClient.execute(get);
		// 如果服务器成功地返回响应
		if (httpResponse.getStatusLine()
			.getStatusCode() == 200)
		{
			// 获取服务器响应字符串
			String result = EntityUtils
				.toString(httpResponse.getEntity());
			System.out.println(result);;
		}
	
	}

}
