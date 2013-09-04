package buaa.swf.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;

import buaa.swf.vo.Cinema;

public class ConnectServerHelper {
	
	public static byte[] os2byte(ByteArrayOutputStream ostream,InputStream is )
	{
		byte[] buffer=new byte[1024];//存储你读到缓存区的数据
		int length;//存储读到缓存区的字节数
		try {
			while((length=is.read(buffer))!=-1){
				ostream.write(buffer, 0, length);			
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ostream.toByteArray();
	}
	
//	public static byte[] byte2is(ByteArrayInputStream istream,OutputStream os )
//	{
//		byte[] buffer=new byte[1024];//存储你读到缓存区的数据
//		int length;//存储读到缓存区的字节数
//		try {
//			while((length=istream.read(buffer))!=-1){
//				istream.read(buffer, 0, length);			
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return istream.toByteArray();
//	}
	
public static void connget(String api)
{
	URL url;

		try {
			url = new URL(api);
		
		HttpURLConnection conn=(HttpURLConnection) url.openConnection();
		conn.setConnectTimeout(5*1000);
		conn.setUseCaches(false);
		conn.setRequestMethod("GET");
		
		//2.从服务器上读取数据
		InputStream is1=conn.getInputStream();
		//3.从流中可以读取数据--->
		//此段可以封装成一个类，一个方法，你给我InputStream的对象 ，返回byte[]
		ByteArrayOutputStream  ostream1=new ByteArrayOutputStream();

		
		is1.close();
		byte[] jsonstring=ostream1.toByteArray();//得到了读取的数据的数组
				
		//4.把读取的数据转成JSON的格式
		String json=new String(jsonstring);
		
		//5.用json的类来处理数据  JSONArray  JSONObject
		
		JSONArray array=new JSONArray(json);
		

		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
}

public static void connpost(String api)
{
	URL url;

		try {
			url = new URL(api);
		
		HttpURLConnection conn=(HttpURLConnection) url.openConnection();
		conn.setConnectTimeout(5*1000);
		conn.setUseCaches(false);
		conn.setRequestMethod("post");
		
		//2.从服务器上读取数据
		InputStream is1=conn.getInputStream();
		//3.从流中可以读取数据--->
		//此段可以封装成一个类，一个方法，你给我InputStream的对象 ，返回byte[]
		ByteArrayOutputStream  ostream1=new ByteArrayOutputStream();

		
		is1.close();
		byte[] jsonstring=ostream1.toByteArray();//得到了读取的数据的数组
				
		//4.把读取的数据转成JSON的格式
		String json=new String(jsonstring);
		
		//5.用json的类来处理数据  JSONArray  JSONObject
		
		JSONArray array=new JSONArray(json);
		

		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
}

/*public static void connsend(String api)
{
	URL url;

		try {
			url = new URL(api);
		
		HttpURLConnection conn=(HttpURLConnection) url.openConnection();
		conn.setConnectTimeout(5*1000);
		conn.setUseCaches(false);
		conn.setRequestMethod("post");
		
		//2.从服务器上读取数据
		//InputStream is1=conn.getInputStream();
		OutputStream os1=conn.getOutputStream();
		//3.从流中可以读取数据--->
		//此段可以封装成一个类，一个方法，你给我InputStream的对象 ，返回byte[]
		ByteArrayInputStream  istream1=new ByteArrayInputStream();

		
		os1.close();
		byte[] jsonstring=ostream1.toByteArray();//得到了读取的数据的数组
				
		//4.把读取的数据转成JSON的格式
		String json=new String(jsonstring);
		
		//5.用json的类来处理数据  JSONArray  JSONObject
		
		JSONArray array=new JSONArray(json);
		

		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
}*/
}

