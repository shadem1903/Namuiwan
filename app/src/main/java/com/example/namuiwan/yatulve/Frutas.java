package com.example.namuiwan.yatulve;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

import java.util.Timer;
import java.util.TimerTask;

public class Frutas extends AppCompatActivity implements View.OnClickListener {
    ImageView imgUchuvas, imgMora, imgMortino, imgFresas,titlemora,titlefresas,titlemortino,titleuchuvas;
    MediaPlayer uchuvas, mora, mortino, fresas, pregunta1;
    int valor = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frutasve);
        referenciar();
    }
    private void referenciar(){
        imgUchuvas= findViewById(R.id.imgUchuvas);
        imgUchuvas.setOnClickListener(this);
        imgMora=findViewById(R.id.imgMora);
        imgMora.setOnClickListener(this);
        imgMortino=findViewById(R.id.imgMortino);
        imgMortino.setOnClickListener(this);
        imgFresas=findViewById(R.id.imgFresas);
        imgFresas.setOnClickListener(this);

        titlefresas=findViewById(R.id.titlefresas);
        titlefresas.setOnClickListener(this);
        titlemora=findViewById(R.id.titlemora);
        titlemora.setOnClickListener(this);
        titlemortino=findViewById(R.id.titlemortino);
        titlemortino.setOnClickListener(this);
        titleuchuvas=findViewById(R.id.titleuchuvas);
        titleuchuvas.setOnClickListener(this);


        uchuvas = MediaPlayer.create(this,R.raw.uchuvave);
        mora = MediaPlayer.create(this,R.raw.morave);
        mortino = MediaPlayer.create(this,R.raw.mortinove);
        fresas = MediaPlayer.create(this,R.raw.fresasve);
        pregunta1 = MediaPlayer.create(this, R.raw.pregunta1frutascualesuchuvave);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgUchuvas:
                titlemora.setVisibility(View.INVISIBLE);
                titlemortino.setVisibility(View.INVISIBLE);
                titlefresas.setVisibility(View.INVISIBLE);
                titleuchuvas.setVisibility(View.VISIBLE);
                uchuvas.start();
                break;

            case R.id.imgMora:
                titlemortino.setVisibility(View.INVISIBLE);
                titlefresas.setVisibility(View.INVISIBLE);
                titleuchuvas.setVisibility(View.INVISIBLE);
                titlemora.setVisibility(View.VISIBLE);
                mora.start();
                break;

            case R.id.imgMortino:
                titlefresas.setVisibility(View.INVISIBLE);
                titleuchuvas.setVisibility(View.INVISIBLE);
                titlemora.setVisibility(View.INVISIBLE);
                titlemortino.setVisibility(View.VISIBLE);
                mortino.start();
                break;
            case R.id.imgFresas:
                titleuchuvas.setVisibility(View.INVISIBLE);
                titlemora.setVisibility(View.INVISIBLE);
                titlemortino.setVisibility(View.INVISIBLE);
                titlefresas.setVisibility(View.VISIBLE);
                fresas.start();
                break;
        }
    }
}