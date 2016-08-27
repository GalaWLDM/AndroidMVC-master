package com.programacion.movil.estemanp.androidmvcapplication.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.programacion.movil.estemanp.androidmvcapplication.Controller.ApplicationController;
import com.programacion.movil.estemanp.androidmvcapplication.R;

public class Inicio extends AppCompatActivity {
    ApplicationController appController;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }
}
