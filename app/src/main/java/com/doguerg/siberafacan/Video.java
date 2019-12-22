package com.doguerg.siberafacan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Video extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Layout tanımlanır
        setContentView(R.layout.videolar);

        //Gerekli ögeler layout sayfasından id ile çekilip burada atanır
        Button M1 = (Button) findViewById(R.id.btnM1);
        Button M2 = (Button) findViewById(R.id.btnM2);
        Button M3 = (Button) findViewById(R.id.btnM3);
        Button mu1 = (Button) findViewById(R.id.btnMu1);
        Button mu2 = (Button) findViewById(R.id.btnMu2);
        Button mu3 = (Button) findViewById(R.id.btnMu3);
        Button mu4 = (Button) findViewById(R.id.btnMu4);

        //Butona basıldığında çalışacak kodlar
        M1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Sonraki sayfaya geçiş(ilgili sayfa, gidilecek sayfa)
                Intent i = new Intent(Video.this, Youtube.class);
                //çalınacak videonun yotube'daki kodu
                i.putExtra("Msg", "UURptlUUQR4");
                //Intentin başlatılması
                startActivity(i);
            }
        });

        M2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Video.this, Youtube.class);
                i.putExtra("Msg", "Kz_soeitDto");
                startActivity(i);
            }
        });

        M3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Video.this, Youtube.class);
                i.putExtra("Msg", "oD6TY0m4X8w");
                startActivity(i);
            }
        });

        mu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Video.this, Youtube.class);
                i.putExtra("Msg", "UzdJ6-6r8WM");
                startActivity(i);
            }
        });

        mu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Video.this, Youtube.class);
                i.putExtra("Msg", "s4sjSed6ubU");
                startActivity(i);
            }
        });

        mu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Video.this, Youtube.class);
                i.putExtra("Msg", "5B9_oH6WbSg");
                startActivity(i);
            }
        });

        mu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Video.this, Youtube.class);
                i.putExtra("Msg", "0K6D2xMuQpI");
                startActivity(i);
            }
        });
    }
}
