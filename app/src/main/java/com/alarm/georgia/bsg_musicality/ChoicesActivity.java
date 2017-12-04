package com.alarm.georgia.bsg_musicality;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class ChoicesActivity extends AppCompatActivity {

    private int aspect;
    private int genre;
    private int DiffLevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choices);

        //First dropdown list
        Spinner spinner=(Spinner)findViewById(R.id.firstList);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.AspectList,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //What happens when you select one of the aspects
                switch(i){
                    case 0:
                        aspect=0;
                        break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        aspect=1;
                        Toast.makeText(ChoicesActivity.this,"You have chosen well!",Toast.LENGTH_SHORT).show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(ChoicesActivity.this,"You chose no aspects",Toast.LENGTH_SHORT).show();
            }
        });

        //Second dropdown list
        Spinner spinner2=(Spinner)findViewById(R.id.secondtList);
        ArrayAdapter<CharSequence> adapter2=ArrayAdapter.createFromResource(this,R.array.GenreList,R.layout.my_spinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                // What happens when you select a genre
                switch(i){
                    case 0:
                        genre=0;
                        break;
                    case 1:
                    case 2:
                    case 3:
                        genre=1;
                        Toast.makeText(ChoicesActivity.this,"Nice choice",Toast.LENGTH_SHORT).show();
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(ChoicesActivity.this,"You chose no genre",Toast.LENGTH_SHORT).show();
            }
        });


        //Third dropdown list
        Spinner spinner3=(Spinner)findViewById(R.id.thirdList);
        ArrayAdapter<CharSequence> adapter3=ArrayAdapter.createFromResource(this,R.array.LevelList,R.layout.my_spinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                //What happens when you select a level of difficulty
                switch(i){
                    case 0:
                        DiffLevel=0;
                        break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        DiffLevel=1;
                        Toast.makeText(ChoicesActivity.this,"Nice level choice",Toast.LENGTH_SHORT).show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(ChoicesActivity.this,"You chose no level",Toast.LENGTH_SHORT).show();
            }
        });
    }

    //Method for when ChoicesButton gets clicked
    public void ChoicesClicked(View view){
        //What happens when you have correctly chosen from the dropdown lists
        if(aspect!=0 && genre!=0 && DiffLevel!=0){
            Intent i_3=new Intent(this,InstrumentTest1.class);
            startActivity(i_3);
        }
        //When no aspect was selected
        else if(aspect==0){
            Toast.makeText(ChoicesActivity.this,"You have not chosen an aspect",Toast.LENGTH_SHORT).show();
        }
        //When no genre was selected
        else if(genre==0){
            Toast.makeText(ChoicesActivity.this,"You have not chosen a genre",Toast.LENGTH_SHORT).show();
        }
        //When no level was selected
        else if(DiffLevel==0){
            Toast.makeText(ChoicesActivity.this,"You have not chosen a level of difficulty",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(ChoicesActivity.this,"Not gonna happen",Toast.LENGTH_SHORT).show();
        }
    }

}
