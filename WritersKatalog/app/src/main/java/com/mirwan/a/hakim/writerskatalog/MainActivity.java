package com.mirwan.a.hakim.writerskatalog;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvWriters;
    private ArrayList<Writer> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvWriters = findViewById(R.id.rv_writers);
        rvWriters.setHasFixedSize(true);

        list.addAll(WritersData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvWriters.setLayoutManager(new LinearLayoutManager(this));
        ListWritersAdapter listWritersAdapter = new ListWritersAdapter(list);
        rvWriters.setAdapter(listWritersAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode){
        switch (selectedMode){
            case R.id.action_about:
                Intent MoveAbout = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(MoveAbout);
                break;
        }
    }

}
