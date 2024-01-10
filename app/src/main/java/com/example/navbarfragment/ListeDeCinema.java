package com.example.navbarfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ListeDeCinema extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_de_cinema);
        String nom = getIntent().getStringExtra("nomDeFilm");
        TextView textView = findViewById(R.id.mon_text_view); // Remplacez par l'ID de votre TextView
        textView.setText(nom); // Définir le texte du TextView sur le nom récupéré

    }
}