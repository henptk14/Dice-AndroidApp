package com.shwepinle.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.util.Log;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton = (Button) findViewById(R.id.rollButton);

        final ImageView Dice1 = (ImageView) findViewById(R.id.image_dice1);
        final ImageView Dice2 = (ImageView) findViewById(R.id.image_dice2);

        final int[] diceArray = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Dicee", "The button has been pressed!");

                Random randomNumber = new Random();

                int number1 = randomNumber.nextInt(6);
                int number2 = randomNumber.nextInt(6);

                Log.d("Dicee", "The random number1 is: " + number1 + ", and number2 is: " + number2);

                Dice1.setImageResource(diceArray[number1]);
                Dice2.setImageResource(diceArray[number2]);
            }
        });
    }
}
