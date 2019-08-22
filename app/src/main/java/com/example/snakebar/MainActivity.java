package com.example.snakebar;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout constraintLayout;
    Button buttonKlik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        constraintLayout= findViewById(R.id.constrainLayout);
        buttonKlik= findViewById(R.id.button_klik);
        buttonKlik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPesan();
            }
        });
    }
    public void showPesan(){
        Snackbar snackbar= Snackbar.make(constraintLayout, "this is snackbar in main", Snackbar.LENGTH_INDEFINITE).setAction("Undo", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar1= Snackbar.make(constraintLayout, "Snackbar Undo succesful in main", Snackbar.LENGTH_SHORT);
                snackbar1.show();
            }
            // set color fungsi
        }).setActionTextColor(Color.RED);
View snackbarView= snackbar.getView();
// set color pesan
        TextView textView=snackbarView.findViewById(android.support.design.R.id.snackbar_text);
        textView.setTextColor(Color.YELLOW);
        snackbar.show();
    }
}
