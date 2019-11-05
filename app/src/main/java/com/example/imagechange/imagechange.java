package com.example.imagechange;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class imagechange extends AppCompatActivity {


        public void change(View view){
            ImageView img = (ImageView)findViewById(R.id.imageView);
            Bitmap bImage = BitmapFactory.decodeResource(this.getResources(),R.drawable.image02);
            img.setImageBitmap(bImage);

        }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
