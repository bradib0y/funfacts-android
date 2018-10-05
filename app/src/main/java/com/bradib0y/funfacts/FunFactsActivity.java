package com.bradib0y.funfacts;

import android.graphics.Color;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {

    private TextView factTextView;
    private Button showFactButton;
    private RelativeLayout relativeLayout;

    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        factTextView = findViewById(R.id.factTextView);
        showFactButton = findViewById(R.id.showTextButton);
        relativeLayout = findViewById(R.id.funFactsLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                factTextView.setText(factBook.get());
                relativeLayout.setBackgroundColor(Color.parseColor(colorWheel.get()));
            }
        };

        showFactButton.setOnClickListener(listener);
    }
}
