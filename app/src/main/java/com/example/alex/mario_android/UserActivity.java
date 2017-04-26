package com.example.alex.mario_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
    }
    /**Apertura di una nuova activity quando viene premuto il tasto prenota**/

    public void Prenota(View view) {
        Button btnPrenota;
        btnPrenota = (Button) findViewById(R.id.book_button);
        /**Apertura di una nuova Activity al Click del bottone Prenota**/
        btnPrenota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prenotazioni = new Intent(UserActivity.this, Prenota.class);
                startActivity(prenotazioni);
            }
        });
    }
}
