package com.example.tsd.helloworld;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    int rezultatdomaci = 0;
    int rezultatgosti = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * prikazuje rezultat domaćih.
     */
    public void rezultatDomaci1(int rezultat) {
        TextView scoreView = (TextView) findViewById(R.id.domaci_rezultat);
        scoreView.setText(String.valueOf(rezultat));
    }

    public void trica_domaci(View view) {
        rezultatdomaci = rezultatdomaci + 3;
        rezultatDomaci1(rezultatdomaci);

    }

    public void dva_domaci(View view) {
        rezultatdomaci= rezultatdomaci+2;
        rezultatDomaci1(rezultatdomaci);

    }

    public void slobodni_domaci(View view) {
        rezultatdomaci=rezultatdomaci+1;
        rezultatDomaci1(rezultatdomaci);

    }

    /**
     * prikazuje rezultat gosta.
     */
    public void rezultatGosti1(int rezultat) {
        TextView scoreView = (TextView) findViewById(R.id.gosti_rezultat);
        scoreView.setText(String.valueOf(rezultat));
    }
    public void trica_gosti(View view) {
        rezultatgosti = rezultatgosti+3;
        rezultatGosti1(rezultatgosti);
    }
    public void dva_gosti(View view) {
        rezultatgosti= rezultatgosti+2;
        rezultatGosti1(rezultatgosti);
    }
    public void slobodno_gosti(View view) {
        rezultatgosti=rezultatgosti+1;
        rezultatGosti1(rezultatgosti);
    }
    /**
     * Reset.
     */



    public void reset(View view) {
        rezultatgosti=0;
        rezultatdomaci=0;
        rezultatGosti1(rezultatgosti);
        rezultatDomaci1(rezultatdomaci);

    }
}
