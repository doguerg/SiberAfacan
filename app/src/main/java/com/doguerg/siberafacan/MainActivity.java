package com.doguerg.siberafacan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Layoutun ayarlanması
        setContentView(R.layout.anamenu);

        //layouttaki değişkenlerin id üzerinden değişkenlere atanması
        ImageButton Btn1 = findViewById(R.id.videoBtn);
        ImageButton Btn2 = findViewById(R.id.yaziBtn);
        //butona basıldığında çalışacak ne varsa buraya yazılır
        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Sayfa geçişinin ayarlanması(ilgili sayfa, gidilecek sayfa)
                Intent goTo = new Intent(MainActivity.this, Video.class);
                startActivity(goTo);
            }
        });

        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goTo = new Intent(MainActivity.this, Yazi.class);
                startActivity(goTo);
            }
        });

    }


}

