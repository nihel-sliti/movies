package com.example.navbarfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class detailsFilm extends AppCompatActivity {
String nomfilm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_film);
        // Récupérer les données
        Intent intent = getIntent();
        int imageResId = intent.getIntExtra("image", 0);
        String heading = intent.getStringExtra("heading");
        String description = intent.getStringExtra("description");

        // Trouver les vues et les mettre à jour avec les données
        ImageView imageView = findViewById(R.id.detail_image);
        TextView headingView = findViewById(R.id.detail_heading);
        TextView descriptionView = findViewById(R.id.detail_description);
        Button getTicket = findViewById(R.id.button_get_tickets);

        imageView.setImageResource(imageResId);
        headingView.setText(heading);
        descriptionView.setText(description);
        nomfilm= heading;
        getTicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(detailsFilm.this, ListeDeCinema.class);
                intent.putExtra("nomDeFilm", heading);  // Remplacez "VotreNom" par la valeur que vous souhaitez passer

                startActivity(intent);

            }
        });
    }
    }
