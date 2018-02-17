package com.example.theon_ph.triker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SantionActivity extends AppCompatActivity {

    private Button mBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_santion);


        mBack = (Button) findViewById(R.id.button2);

        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SantionActivity.this, ChoiceActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });

    }
}
