package com.mirwan.a.hakim.writerskatalog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {
    ImageView image;
    TextView name;
    TextView detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        setName();
        setImage();
        setDetail();
    }

    public void setName(){
        name = findViewById(R.id.tv_item_name);
        name.setText(getIntent().getStringExtra("name"));
    }
    public void setImage(){
        image = findViewById(R.id.img_item_photo);
        image.setImageResource(getIntent().getIntExtra("image", R.drawable.me));
    }

    public void setDetail(){
        detail = findViewById(R.id.tv_item_detail);
        detail.setText(getIntent().getStringExtra("detail"));
    }
}
