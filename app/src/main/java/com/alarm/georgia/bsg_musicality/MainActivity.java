package com.alarm.georgia.bsg_musicality;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    // Declare variables
    private  ListView Menu;
    private String[] listMenu={"Continue Saved Game", "New Game","Quick Play Mode","Description"};
    private ListAdapter MyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create an adapter for Menu list
        MyAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,listMenu);
        Menu=findViewById(R.id.Menu);
        Menu.setAdapter(MyAdapter);

        //Method to handle onClick events from menu list
        Menu.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        // What happens when we click on each of the items of our menu
                        switch(i){
                            //When we click on Continue Saved Game
                            case 0:
                                Toast.makeText(MainActivity.this,"There is no saved game", Toast.LENGTH_SHORT).show();
                                break;

                            //When we click on New Game
                            case 1:
                                Toast.makeText(MainActivity.this,"The story mode has not been developed yet", Toast.LENGTH_SHORT).show();
                                break;

                            //When we click on Quick Play Mode
                            case 2:
                                Intent intent=new Intent(MainActivity.this,ChoicesActivity.class);
                                startActivity(intent);
                                break;

                            //When we click on Description
                            case 3:
                                Intent i_2=new Intent(MainActivity.this,DescriptionActivity.class);
                                startActivity(i_2);
                                break;
                        }

                    }
                }

        );

    }
}
