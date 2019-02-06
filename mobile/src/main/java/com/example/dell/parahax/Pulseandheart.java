package com.example.dell.parahax;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Pulseandheart extends AppCompatActivity {


    private Button checkreadings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pulseandheart);

        checkreadings = (Button) findViewById(R.id.button2);


        checkreadings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pulseandheart.this, choosevids.class);
                startActivity(intent);
            }
        });


    }

}
