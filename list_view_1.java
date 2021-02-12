package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class list_view_1 extends AppCompatActivity {
    ListView itemlist;
    String[] item={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_1);
        itemlist=(ListView)findViewById(R.id.list1);

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,item);
        itemlist.setAdapter(arrayAdapter);

        itemlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i=new Intent(list_view_1.this,norecord.class);
                startActivity(i);
            }
        });
    }
}
