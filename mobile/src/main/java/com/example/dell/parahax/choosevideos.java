package com.example.dell.parahax;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class choosevideos extends AppCompatActivity {

    private Button youtube;

    private Button gallery;

    private Button search;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosevideos);

        youtube = (Button) findViewById(R.id.button3);

        gallery = (Button) findViewById(R.id.button);

        search = (Button) findViewById(R.id.button4);


        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GotoYoutube();
            }
        });


        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GotoGallery();
            }
        });



        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GotoSearch();
            }
        });









    }


    private void GotoYoutube(){

        Intent intent = new Intent(choosevideos.this, playvid.class);
        startActivity(intent);


    }



    private void GotoGallery(){

        Intent intent = new Intent(choosevideos.this, playvid.class);
        startActivity(intent);


    }



    private void GotoSearch(){

        Intent intent = new Intent(choosevideos.this, playvid.class);
        startActivity(intent);


    }


}

