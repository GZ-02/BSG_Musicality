package com.alarm.georgia.bsg_musicality;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class InstrumentTest1 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instrument_test1);


    }

    public void ReturnToMenu(View view){
        Intent intent2=new Intent(InstrumentTest1.this,MainActivity.class);
        startActivity(intent2);
    }

    public void DoMusicTest(View view){

    }

    public void ExitGame(View view){

    }
}
