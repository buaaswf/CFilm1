package buaa.swf.android;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import buaa.swf.vo.FilmInfo;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.AdapterView.OnItemClickListener;

public class CinemaInfoActivity extends Activity {
	 private List<HashMap<String, Object>> filmListItem;
	    private String[] filmName = { "北京遇上西雅图", "合伙人", "小时代", "开心超人", "富春山居图 " };
	    private String[] director = { "赵薇", "郭敬明", "冯小刚", "冯小刚", "冯小刚" };
	    private String[] starring = { "杨幂 /柯震东1", "杨幂 /柯震东2", "杨幂 /柯震东3", "杨幂 /柯震东4",
	            "杨幂 /柯震东5" };
	    private String[] produce = { "中国", "日本", "中国", "中国", "中国" };
	    private String[] actionTime = { "2013-08-07", "2013-08-01", "2013-09-07",
	            "2013-11-07", "2013-08-17" };
	    private String[] summary = { "很好看的电影！", "很好看的电影！", "很好看的电影！", "很好看的电影！",
	            "很好看的电影！" };
	    private List<FilmInfo> filmsList;

	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.cinema_info_activity);
	        initFilmInfos();
	        initList();
	    }

	    private void initFilmInfos() {
	        filmsList = new ArrayList<FilmInfo>();
	        for (int i = 0; i < filmName.length; i++) {
	            FilmInfo filmInfo = new FilmInfo();
	            filmInfo.setFilmName(filmName[i]);
	            filmInfo.setDirector(director[i]);
	            filmInfo.setStarring(starring[i]);
	            filmInfo.setProduce(produce[i]);
	            filmInfo.setSummary(summary[i]);
	            filmInfo.setActionTime(actionTime[i]);
	            filmInfo.setImgUrl(R.drawable.default_image + "");
	            filmsList.add(filmInfo);
	        }
	    }

	    private void initList() {
	        filmListItem = new ArrayList<HashMap<String, Object>>();
	        for (int i = 0; i < filmsList.size(); i++) {
	            HashMap<String, Object> map = new HashMap<String, Object>();
	            map.put("imgUrl", Integer.valueOf(filmsList.get(i).getImgUrl()));
	            map.put("filmName", filmsList.get(i).getFilmName());
	            map.put("director", getString(R.string.daoyan)
	                    + filmsList.get(i).getDirector());
	            map.put("starring", getString(R.string.zhuyan)
	                    + filmsList.get(i).getStarring());

	            filmListItem.add(map);
	        }
	        SimpleAdapter listItemAdapter = new SimpleAdapter(this, filmListItem,
	                R.layout.film_list_listview, new String[] { "imgUrl",
	                        "filmName", "director", "starring", }, new int[] {
	                        R.id.imgUrl, R.id.film_name, R.id.daoyan, R.id.zhuyan });
	        ListView filmListView = (ListView) findViewById(R.id.filmListView);
	        filmListView.setAdapter(listItemAdapter);
	        filmListView.setOnItemClickListener(new OnItemClickListener() {
	            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
	                    long arg3) {
	                Intent intent = new Intent(CinemaInfoActivity.this,
	                        FilmInfoActivity.class);
	                intent.putExtra("filmInfo", filmsList.get(arg2));
	                startActivity(intent);
	            }

	        });
	        
	    }
}
