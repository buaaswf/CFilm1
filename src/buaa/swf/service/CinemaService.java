package buaa.swf.service;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import android.util.Log;

import buaa.swf.vo.Cinema;

public class CinemaService {
	public static List<Cinema> listCinemaInfo(){
	
		//1.连接上服务器
		
		List<Cinema> list=new ArrayList<Cinema>();
		Log.v("test", "test000");
				String cineAPI="http://192.168.88.67:8080/cserver/UserServlet";
				URL url;
				try {
					url = new URL(cineAPI);
					HttpURLConnection conn=(HttpURLConnection) url.openConnection();
					Log.v("test", "test11");
					conn.setConnectTimeout(5*1000);
					conn.setUseCaches(false);
					conn.setRequestMethod("GET");
					Log.v("test", "test222");
					//Log.v("test", "-->"+conn.);
					//2.从服务器上读取数据
					InputStream is=conn.getInputStream();
					//3.从流中可以读取数据--->
					//此段可以封装成一个类，一个方法，你给我InputStream的对象 ，返回byte[]
					ByteArrayOutputStream  ostream=new ByteArrayOutputStream();
					byte[] buffer=new byte[1024];//存储你读到缓存区的数据
					int length;//存储读到缓存区的字节数
					while((length=is.read(buffer))!=-1){
						ostream.write(buffer, 0, length);			
					}
					is.close();
					byte[] jsonstring=ostream.toByteArray();//得到了读取的数据的数组
							
					//4.把读取的数据转成JSON的格式
					String json=new String(jsonstring);
					System.out.println("json======="+json);
					
					//5.用json的类来处理数据  JSONArray  JSONObject
					
					JSONArray array=new JSONArray(json);
					
					for (int i=0;i<array.length();i++) {
						JSONObject object=array.getJSONObject(i);
						int id=object.getInt("id");
						String name=object.getString("name");
						System.out.println("id--->"+id+"   name-->"+name);
						Cinema cinema=new Cinema();
						list.add(cinema);
					}
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				
				return list;
				
	}
}
