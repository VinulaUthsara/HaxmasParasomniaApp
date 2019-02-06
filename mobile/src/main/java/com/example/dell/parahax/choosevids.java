package com.example.dell.parahax;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class choosevids extends AppCompatActivity {

private Button youtube;
private Button gallery;
private Button search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosevids);

        youtube = (Button)findViewById(R.id.button6);
        gallery = (Button) findViewById(R.id.button7);
        search = (Button) findViewById(R.id.button8);


        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(choosevids.this, playvid.class);
                startActivity(intent);
            }
        });


        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(choosevids.this, playvid.class);
                startActivity(intent);
            }
        });



        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(choosevids.this, playvid.class);
                startActivity(intent);
            }
        });



    }
}
