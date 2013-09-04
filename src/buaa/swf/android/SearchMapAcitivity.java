package buaa.swf.android;


import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class SearchMapAcitivity extends Activity {
	 protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.searchmap_activity);
	        TextView textView=(TextView)findViewById(R.id.yingyuanmingzi);
	        textView.setText(getIntent().getStringExtra("yingyuanmingzi"));
	        Button button=(Button)findViewById(R.id.zhidiankefu);
	        button.setOnClickListener(new OnClickListener(){
	            
	            public void onClick(View v) {
	              Intent in = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "xxxxxxxxxxxx"));
	              in.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
	              startActivity(in);
	            }
	            
	        });
	        
	        Button button1=(Button)findViewById(R.id.googlemap);
	        button1.setOnClickListener(new OnClickListener(){
	            
	            public void onClick(View v) {
	                String q="���ݵ�ӰԺ";
	                Uri uri = Uri.parse("http://maps.google.com/maps?q="+q+"&����=����&z=21");
	                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
	                ComponentName comp = new ComponentName("com.google.android.apps.maps","com.google.android.maps.MapsActivity");
	                intent.setComponent(comp);
	                startActivity(intent);
	            }
	            
	        });
	        
	        Button button2=(Button)findViewById(R.id.yingyuanziliao);
	        button2.setOnClickListener(new OnClickListener(){
	            
	            public void onClick(View v) {
	                Intent intent=new Intent(SearchMapAcitivity.this,CinemaInfoActivity.class);
	                startActivity(intent);
	                finish();
	            }
	            
	        });

	    }
}
