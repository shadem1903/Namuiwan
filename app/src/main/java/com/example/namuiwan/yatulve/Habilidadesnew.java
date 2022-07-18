package com.example.namuiwan.yatulve;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

import com.example.namuiwan.Menued;
import com.example.namuiwan.R;
import com.example.namuiwan.erikadaniel.Inicio;

public class Habilidadesnew extends AppCompatActivity implements View.OnClickListener {

    ImageView imgNumeros, imgtitlealimentosfrios,imgFrutas;
    MediaPlayer pregunta1,pregunta2,pregunta3;
    public static  int  puntos=4;
    public static int puntosFrutas,puntosVerduras,PuntosNumeros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_habilidadesnew);
        referenciar();
    }

    private void referenciar() {
        imgNumeros = findViewById(R.id.imgNumeros);
        imgNumeros.setOnClickListener(this);
        imgtitlealimentosfrios = findViewById(R.id.imgtitlealimentosfrios);
        imgtitlealimentosfrios.setOnClickListener(this);
        imgFrutas = findViewById(R.id.imgFrutas);
        imgFrutas.setOnClickListener(this);

        pregunta1 = MediaPlayer.create(this, R.raw.pregunta1frutascualesuchuvave);
        pregunta2 = MediaPlayer.create(this,R.raw.pregunta1vegetcualesrepollo);
        pregunta3 = MediaPlayer.create(this, R.raw.pregunta1cualeseluno);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode==event.KEYCODE_BACK) {
            Intent intent = new Intent(Habilidadesnew.this, Menued.class);
            startActivity(intent);
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgFrutas:
                puntos = 4;
                Toast.makeText(Habilidadesnew.this, "¿Cual es la uchuva...?", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(Habilidadesnew.this, Pregunta1frutas.class);
                pregunta1.start();
                startActivity(intent1);
                break;
            case R.id.imgtitlealimentosfrios:
                puntos = 4;
                Toast.makeText(Habilidadesnew.this, "¿Cual es el repollo...?", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(Habilidadesnew.this, Pregunta1vegefrio.class);
                pregunta2.start();
                startActivity(intent2);
                break;
            case R.id.imgNumeros:
                puntos=0;
                Toast.makeText(Habilidadesnew.this, "¿Cual es el 1...?", Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(Habilidadesnew.this, Pregunta1numeros.class);
                pregunta3.start();
                startActivity(intent3);

                break;
        }
    }
}