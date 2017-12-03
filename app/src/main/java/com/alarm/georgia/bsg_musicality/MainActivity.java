package com.alarm.georgia.bsg_musicality;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    //private String TAG="com.alarm.georgia";
    private ListView Menu;
    private String[] listMenu={"Continue Saved Game", "New Game","Quick Play Mode","Description"};
    private ListAdapter MyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,listMenu);
        Menu=findViewById(R.id.Menu);
        Menu.setAdapter(MyAdapter);

        Menu.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Toast.makeText(MainActivity.this,"To be continued", Toast.LENGTH_LONG).show();
                    }
                }

        );

    }
}
