package com.example.proj160v4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class ChargeNow extends AppCompatActivity {

    private TextView chargeRemainText;
    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charge_now);

        Intent intent = getIntent();
        String charge = intent.getExtras().getString("Charge");

        chargeRemainText = findViewById(R.id.chargeRemainText);
        imageButton = (ImageButton) findViewById(R.id.imageButton);

        chargeRemainText.setText("Charge Remaining: " + charge + " hours");

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(ChargeNow.this, Settings.class);
                startActivity(intent2);
            }
        });
    }
}
