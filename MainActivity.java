package com.example.cardview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    CardView card,card2,card3,card4,card5,card6,card7,card8;


    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder =new AlertDialog.Builder(this);
        builder.setMessage("Are You Sure Want To Exit ?");
        builder.setCancelable(true);
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                MainActivity.super.onBackPressed();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.toolbar);
        drawerLayout=findViewById(R.id.drawer_layout);
        navigationView=findViewById(R.id.navigationView);
        card=(CardView)findViewById(R.id.card1);
        card2=(CardView)findViewById(R.id.card2);
        card3=(CardView)findViewById(R.id.card3);
        card4=(CardView)findViewById(R.id.card4);
        card5=(CardView)findViewById(R.id.card5);
        card6=(CardView)findViewById(R.id.card6);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("               InSink");

        final ActionBar actionBar= getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp);

        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,list_view_1.class);
                startActivity(i);
            }
        });
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,list_view_1.class);
                startActivity(i);
            }
        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,list_view_1.class);
                startActivity(i);
            }
        });
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,list_view_1.class);
                startActivity(i);
            }
        });
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,list_view_1.class);
                startActivity(i);
            }
        });
        card6  .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,list_view_1.class);
                startActivity(i);
            }
        });
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.syllabus:
                        item.setChecked(true);
                        displayMessage("Syallabus Selected...");
                        drawerLayout.closeDrawers();
                        return true;

                    case R.id.questions:
                        item.setChecked(true);
                        displayMessage("Question Selected...");
                        drawerLayout.closeDrawers();
                        return true;
                    case R.id.attendance:
                        item.setChecked(true);
                        displayMessage("Attendance Selected...");
                        drawerLayout.closeDrawers();
                        return true;
                    case R.id.notice:
                        item.setChecked(true);
                        displayMessage("Notice Selected...");
                        drawerLayout.closeDrawers();
                        return true;
                    case R.id.result:
                        item.setChecked(true);
                        displayMessage("Result Selected...");
                        drawerLayout.closeDrawers();
                        return true;
                    case R.id.achievement:
                        item.setChecked(true);
                        displayMessage("Achievement Selected...");
                        drawerLayout.closeDrawers();
                        return true;

                }
                return false;
            }
        });
    }

    private void displayMessage(String message)
    {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.app_bar_menu,menu);

        return true;
    }

}
