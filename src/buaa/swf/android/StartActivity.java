
package buaa.swf.android;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * @author buaa.swf qq 876267233
 *
 */
public class StartActivity extends Activity {
	   @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        requestWindowFeature(Window.FEATURE_NO_TITLE);
	        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
	                WindowManager.LayoutParams.FLAG_FULLSCREEN);
	        setContentView(R.layout.start_activity);
	        Button button = (Button) findViewById(R.id.film_list);
	        button.setOnClickListener(new OnClickListener() {
	            public void onClick(View v) {
	                startActivity(new Intent(StartActivity.this,
	                        FilmListActivity.class));
	                finish();
	            }

	        });

	    }
}
