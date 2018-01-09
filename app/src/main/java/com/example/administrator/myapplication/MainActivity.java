package com.example.administrator.myapplication;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = (ProgressBar) findViewById(R.id.progressBar);
//        progressBar.setProgress(20);

//        boolean flag = progressBar.isIndeterminate();

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "我白点击了", Toast.LENGTH_SHORT).show();
                System.out.print("-----------------我被点击了");
                Log.e("MainActivity", "-----------------我被点击了");

            }
        });


    }


}
