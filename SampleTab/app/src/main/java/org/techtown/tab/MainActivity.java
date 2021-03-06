package org.techtown.tab;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    
    Fragment1 fragment1;
    Fragment2 fragment2;
    Fragment3 fragment3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowTitleEnabled(false);
        
        fragment1=new Fragment1();
        fragment2=new Fragment2();
        fragment3=new Fragment3();
        
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment1).commit();
    }

    private void setSupportActionBar(Toolbar toolbar) {
    }

}