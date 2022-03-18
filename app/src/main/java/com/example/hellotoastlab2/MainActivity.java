package com.example.hellotoastlab2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // declaring the variables for every views
    private Button Toast_btn, Count_btn, Zero_btn;

    private TextView Count_View;

    // declaring an integer value set initially to 0
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // assigning the view to the variables using their id
        Toast_btn = findViewById(R.id.button_toast2);
        Count_btn = findViewById(R.id.button_count2);
        Zero_btn = findViewById(R.id.button_zero);

        Count_View = findViewById(R.id.show_count2);

        // using anonymous function because function is declared after 'new' keyword instead of object name
        // setting an onClick listener for the count button to increase the count when clicked
        Count_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // increment in the value of variable
                count++;
                // count+"" is done to convert into string
                // setting the value of the counter to the textView
                Count_View.setText(count + "");
                // setting the background color of zero button when count button is pressed
                Zero_btn.setBackgroundResource(R.color.teal_200);

                // checking if the value of count is even or odd at the moment
                if(count % 2 == 0)
                {
                    // set color if even
                    Count_btn.setBackgroundResource(R.color.green);
                }
                else if(count % 2 == 1){
                    // set color if odd
                    Count_btn.setBackgroundResource(R.color.black);
                }
            }
        });

        // setting an onClick listener for the toast button to display the toast message when clicked
        Toast_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // displaying toast message
                // Toast is a pre-defined class
                // MainActivity.this -> calling the parent constructor/class
                Toast.makeText(MainActivity.this, "You are great!", Toast.LENGTH_SHORT).show();
            }
        });

        Zero_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // setting the count to 0
                count = 0;
                // setting the text to the textView
                Count_View.setText(count + "");
                // setting the background color to the count button
                Count_btn.setBackgroundResource(R.color.purple_500);
                // setting the background color to the zero button
                Zero_btn.setBackgroundResource(R.color.grey);
            }
        });
    }
}