package login.com.girish.logindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editUsername, editPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // new operator
        //we know this way to create object..
        //Right.....
        //editUsername = new EditText(this);
        //editUsername.setId(R.id.editText);
        //editPassword = new EditText(this);
        //editPassword.setId(R.id.editText2);
        editUsername = findViewById(R.id.editText);
        editPassword = findViewById(R.id.editText2);
        Log.i("MainActivity","onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainActivity","onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivity","onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivity","onPause()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MainActivity","onRestart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity","onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity","onDestroy()");
    }

    public void login(View view) {
       ///here you can execute your code
       //Correct.... Y or N
        String username=editUsername.getText().toString();
        String password = editPassword.getText().toString();
        if (username.equals("girish") && password.equals("123456")){
            //correct
            Log.i("MainActivity","SUCCESS");
            //We need to open New Activity i.e. WelcomeActivity
            //We need an Activity
            //Now we can use Intent.......
            Intent intent = new Intent();
            //intent.setClass(this,WelcomeActivity.class);
            //Action String....
            intent.setAction("login.com.girish.logindemo.Girish");
            intent.putExtra("u",username);
            intent.putExtra("p",password);
            //intent.putExtra("b",false);
            startActivity(intent);

        }else {
            //incorrect
            Log.i("MainActivity","FAIL");
        }
    }
}










