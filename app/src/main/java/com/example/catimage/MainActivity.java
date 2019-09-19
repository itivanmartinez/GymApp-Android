package com.example.catimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void switchCats(View view){
        Log.i("Info:","Button Pressed");
        ImageView image= (ImageView) findViewById(R.id.imageView);
        image.setImageResource(R.drawable.cat2);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
