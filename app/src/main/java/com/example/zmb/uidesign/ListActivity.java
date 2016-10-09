package com.example.zmb.uidesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
String data[] = {"苹果","橘子","香蕉","桃子","红薯","荔枝","黄瓜","葫芦","白菜","丝瓜","南瓜",};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(ListActivity.this,android.R.layout.simple_list_item_1,data);
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(stringArrayAdapter);
    }
}
