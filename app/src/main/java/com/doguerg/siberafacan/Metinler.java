package com.doguerg.siberafacan;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class Metinler extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.metin);
        Bundle extras = getIntent().getExtras();
        String text = extras.getString("metin");
        TextView tv = (TextView) findViewById(R.id.yazi1);
        tv.setText(text);

    }
}
