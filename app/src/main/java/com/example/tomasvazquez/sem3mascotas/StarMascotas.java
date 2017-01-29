package com.example.tomasvazquez.sem3mascotas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

import static com.example.tomasvazquez.sem3mascotas.R.id.rvMascotas;
import static com.example.tomasvazquez.sem3mascotas.R.id.rvStarMascotas;

public class StarMascotas extends AppCompatActivity {


    ArrayList<Mascota> starmascota;
    private RecyclerView listaStarMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_star_mascotas);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listaStarMascotas = (RecyclerView) findViewById(R.id.rvStarMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaStarMascotas.setLayoutManager(llm);

        inicializarListaStarMascotas();
        inicializarStarAdaptador();
    }

    public void inicializarStarAdaptador(){
        StarAdaptador adaptador = new StarAdaptador(starmascota);
        listaStarMascotas.setAdapter(adaptador);
    }


    public void inicializarListaStarMascotas(){
        starmascota = new ArrayList<Mascota>();

        starmascota.add(new Mascota(R.drawable.mascota1,getResources().getString(R.string.tvMascota1),getResources().getString(R.string.tvMas1Edad),getResources().getString(R.string.tvTelContactoMas1), (byte) 0));
        starmascota.add(new Mascota(R.drawable.mascota2,getResources().getString(R.string.tvMascota2),getResources().getString(R.string.tvMas2Edad),getResources().getString(R.string.tvTelContactoMas2), (byte) 0));
        starmascota.add(new Mascota(R.drawable.mascota3,getResources().getString(R.string.tvMascota3),getResources().getString(R.string.tvMas3Edad),getResources().getString(R.string.tvTelContactoMas3), (byte) 0));
        starmascota.add(new Mascota(R.drawable.mascota4,getResources().getString(R.string.tvMascota4),getResources().getString(R.string.tvMas4Edad),getResources().getString(R.string.tvTelContactoMas4), (byte) 0));
        starmascota.add(new Mascota(R.drawable.mascota5,getResources().getString(R.string.tvMascota5),getResources().getString(R.string.tvMas5Edad),getResources().getString(R.string.tvTelContactoMas5), (byte) 0));

    }


}

