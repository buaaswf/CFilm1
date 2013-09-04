package buaa.swf.android;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        Button button = (Button) findViewById(R.id.login);

        final EditText yhmEditText = (EditText) findViewById(R.id.yh_edit);
        final EditText mmEditText = (EditText) findViewById(R.id.mm_edit);

        button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (yhmEditText.getText().toString().trim().equals("")
                        || mmEditText.getText().toString().trim().equals("")) {
                    Toast.makeText(LoginActivity.this, "��������������Ϣ",
                            Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent = new Intent(LoginActivity.this,
                        SureActivity.class);
                intent.putExtra("dianyingyuanname", getIntent().getStringExtra(
                        "dianyingyuanname"));
                
                intent.putExtra("dizhi", getIntent().getStringExtra(
                "dianyingyuanname"));
                
                intent.putExtra("fangyingting", getIntent().getStringExtra(
                        "fangyingting"));
                intent.putExtra("actionTime", getIntent().getStringExtra(
                        "actionTime"));
                intent.putExtra("zuoci", getIntent().getStringExtra("zuoci"));
                intent.putExtra("count", getIntent().getStringExtra("count"));

                intent.putExtra("fm", getIntent().getStringExtra("fm"));
                startActivity(intent);
            }

        });
    }
}
