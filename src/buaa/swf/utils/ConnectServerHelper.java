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
		byte[] buffer=new byte[1024];//�洢�����������������
		int length;//�洢�������������ֽ���
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
//		byte[] buffer=new byte[1024];//�洢�����������������
//		int length;//�洢�������������ֽ���
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
		
		//2.�ӷ������϶�ȡ����
		InputStream is1=conn.getInputStream();
		//3.�����п��Զ�ȡ����--->
		//�˶ο��Է�װ��һ���࣬һ�������������InputStream�Ķ��� ������byte[]
		ByteArrayOutputStream  ostream1=new ByteArrayOutputStream();

		
		is1.close();
		byte[] jsonstring=ostream1.toByteArray();//�õ��˶�ȡ�����ݵ�����
				
		//4.�Ѷ�ȡ������ת��JSON�ĸ�ʽ
		String json=new String(jsonstring);
		
		//5.��json��������������  JSONArray  JSONObject
		
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
		
		//2.�ӷ������϶�ȡ����
		InputStream is1=conn.getInputStream();
		//3.�����п��Զ�ȡ����--->
		//�˶ο��Է�װ��һ���࣬һ�������������InputStream�Ķ��� ������byte[]
		ByteArrayOutputStream  ostream1=new ByteArrayOutputStream();

		
		is1.close();
		byte[] jsonstring=ostream1.toByteArray();//�õ��˶�ȡ�����ݵ�����
				
		//4.�Ѷ�ȡ������ת��JSON�ĸ�ʽ
		String json=new String(jsonstring);
		
		//5.��json��������������  JSONArray  JSONObject
		
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
		
		//2.�ӷ������϶�ȡ����
		//InputStream is1=conn.getInputStream();
		OutputStream os1=conn.getOutputStream();
		//3.�����п��Զ�ȡ����--->
		//�˶ο��Է�װ��һ���࣬һ�������������InputStream�Ķ��� ������byte[]
		ByteArrayInputStream  istream1=new ByteArrayInputStream();

		
		os1.close();
		byte[] jsonstring=ostream1.toByteArray();//�õ��˶�ȡ�����ݵ�����
				
		//4.�Ѷ�ȡ������ת��JSON�ĸ�ʽ
		String json=new String(jsonstring);
		
		//5.��json��������������  JSONArray  JSONObject
		
		JSONArray array=new JSONArray(json);
		

		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
}*/
}

