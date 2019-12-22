package com.doguerg.siberafacan;

//Kütüphane tanımlamaları
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Yazi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Layout tanımlanır
        setContentView(R.layout.yazilar);

        //Gerekli bilgiler layout sayfasından id ile çekilip burada atanır
        Button birinci = findViewById(R.id.btnmetin1);
        Button ikinci = findViewById(R.id.btnmetin2);
        Button ucuncu = findViewById(R.id.btnmetin3);
        Button dorduncu = findViewById(R.id.btnmetin4);
        Button besinci = findViewById(R.id.btnmetin5);


        //Butonların kodları
        birinci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Yazi.this, Metinler.class);
                System.out.println(R.string.metin1);
                i.putExtra("metin",getString(R.string.metin1));
                startActivity(i);
            }
        });
        ikinci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Yazi.this, Metinler.class);
                System.out.println(R.string.metin2);
                i.putExtra("metin",getString(R.string.metin2));
                startActivity(i);
            }
        });
        ucuncu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Yazi.this, Metinler.class);
                System.out.println(R.string.metin3);
                i.putExtra("metin",getString(R.string.metin3));
                startActivity(i);
            }
        });
        dorduncu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Yazi.this, Metinler.class);
                System.out.println(R.string.metin4);
                i.putExtra("metin",getString(R.string.metin4));
                startActivity(i);
            }
        });
        besinci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Yazi.this, Metinler.class);
                System.out.println(R.string.metin5);
                i.putExtra("metin",getString(R.string.metin5));
                startActivity(i);
            }
        });
    }
}
