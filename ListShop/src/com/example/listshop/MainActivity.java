package com.example.listshop;

import java.util.ArrayList;
import java.util.Arrays;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
 
public class MainActivity extends Activity {
 
    private ListView list ;  
    private ArrayAdapter<String> adapter ;  
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 
        list = (ListView) findViewById(R.id.listView1);
 
        String cars[] = {"Mercedes", "Fiat", "Ferrari", "Aston Martin"};
 
        ArrayList<String> carL = new ArrayList<String>();  
        carL.addAll( Arrays.asList(cars) );  
 
        adapter = new ArrayAdapter<String>(this, R.layout.row, carL);
        
        if(adapter==null)Log.d("MainActivity","adapter jest zerowy");
        if(list==null)Log.d("MainActivity","Lista jest zerowa");
        
        list.setAdapter(adapter);
    }
}