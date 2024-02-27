package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView Iv1;
    Button btn;
    Random rnd = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Iv1 = findViewById(R.id.Iv1);
        btn = findViewById(R.id.btn);
    }
    public void click1(View view){
        int rnd1 = rnd.nextInt(3)+1;
        btn.setText(""+rnd1);
        if (rnd1 == 1){
            Iv1.setImageResource(R.drawable.i1);
        }
        else if (rnd1 == 2){
            Iv1.setImageResource(R.drawable.i2);
        }
        else {
            Iv1.setImageResource(R.drawable.i3);
        }
      }

    }
