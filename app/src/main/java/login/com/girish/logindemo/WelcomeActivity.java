package login.com.girish.logindemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {
    private TextView tvOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        tvOut = findViewById(R.id.textView);
        Intent intent = getIntent();
        String u = intent.getStringExtra("u");
        String p = intent.getStringExtra("p");
        tvOut.setText("Welcome "+u+", your password is "+p);
        Log.i("WelcomeActivity","onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("WelcomeActivity","onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("WelcomeActivity","onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("WelcomeActivity","onPause()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("WelcomeActivity","onRestart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("WelcomeActivity","onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("WelcomeActivity","onDestroy()");
    }

    public void openBrowser(View view) {
        Uri uri = Uri.parse("tel:12345678");
        Intent intent = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(intent);
    }
}
