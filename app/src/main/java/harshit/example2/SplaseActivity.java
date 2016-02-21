package harshit.example2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splase);
        Runnable runnable3secs=new Runnable() {
            @Override
            public void run() {
                nextActivity();
                finish();
            }
        };
        Handler myhandler=new Handler();
        myhandler.postDelayed(runnable3secs,3000);
    }

    public void nextActivity(){
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);

    }



    }
