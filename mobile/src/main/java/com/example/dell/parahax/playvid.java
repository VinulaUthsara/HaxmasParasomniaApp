package com.example.dell.parahax;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class playvid extends AppCompatActivity {

    private Button playonproj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playvid);

        playonproj = (Button)findViewById(R.id.button5);

        playonproj.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Toast.makeText(playvid.this, "Playing on projector...",Toast.LENGTH_SHORT).show();
                playonproj();
            }
        });
    }


    private void playonproj(){
        Intent intent = new Intent(playvid.this, analytics.class);
        startActivity(intent);
    }
}
