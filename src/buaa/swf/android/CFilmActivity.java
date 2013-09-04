package buaa.swf.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class CFilmActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button bt=(Button) findViewById(R.id.button1);
       
        
       
        bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
                startActivity(new Intent(CFilmActivity.this,
                        FilmListActivity.class));
                Log.v("test2","=======>=======" );
                finish();
				
			
		}
        });
        
        Button bt1=(Button) findViewById(R.id.widget69);
        bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
                startActivity(new Intent(CFilmActivity.this,
                        LoginActivity.class));
                Log.v("test2","=======>=======" );
                finish();
				
			
		}
        });
        Log.v("test","=======>" );
    
    }
}