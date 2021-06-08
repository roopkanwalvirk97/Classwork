package com.example.dicegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView leftDie, rightDie;
    Button rollButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // we want to link our components with these objects in my code!
        //findViewById()
        leftDie = findViewById(R.id.left_die); // we find the view and link it to instant of
        // the object that I created
        rightDie = findViewById(R.id.right_die);
        rollButton = findViewById(R.id.roll_button);
        // randomly pick these picture of dices that I have in my drawable!
        int [] diceArray = {R.drawable.dice1,
        R.drawable.dice2,
        R.drawable.dice3,
        R.drawable.dice4,
        R.drawable.dice5,
        R.drawable.dice6};


        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // what we want to do when you click your botton
                Random rand = new Random(); // this needs to be imported

                int randNumLeft = rand.nextInt(6);
                int randNumRight = rand.nextInt(6);
                Log.d("Dicebutton","I am clicked"+"Left"+randNumLeft+"Right"+randNumRight);
                // Toast is a fast way of showing information on your activity!

                leftDie.setImageResource(diceArray[randNumLeft]);
                rightDie.setImageResource(diceArray[randNumRight]);

            }
        });





    }
}