package com.bradib0y.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FunFactsActivity extends AppCompatActivity {

    private TextView factTextView;
    private Button showFactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        factTextView = findViewById(R.id.factTextView);
        showFactButton = findViewById(R.id.showTextButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = "Ostriches can run faster than horses.";
                factTextView.setText(fact);
            }
        };

        showFactButton.setOnClickListener(listener);
    }
}
