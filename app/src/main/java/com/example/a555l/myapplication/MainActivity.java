package com.example.a555l.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ImageView;

import static android.graphics.Color.parseColor;

public class MainActivity extends AppCompatActivity {

public MainActivity ();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    // Example of a call to a native method
        final TextView txtChange = (TextView)findViewById(R.id.text1);
        Button btnRed = (Button)findViewById(R.id.button1);
        Button btnBlue = (Button)findViewById(R.id.button2);

        btnRed.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                txtChange.setTextColor(parseColor("#AA0000"));
                txtChange.setText("I am red");
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                txtChange.setTextColor(parseColor("#0000AA"));
                txtChange.setText("I am blue");
            }
        });


    }

}
