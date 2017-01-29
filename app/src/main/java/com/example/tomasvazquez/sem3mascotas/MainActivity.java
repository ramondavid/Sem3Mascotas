package com.example.tomasvazquez.sem3mascotas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.R.*;

import java.util.ArrayList;

import static com.example.tomasvazquez.sem3mascotas.R.id.rvMascotas;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar)findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);


        listaMascotas = (RecyclerView) findViewById(rvMascotas);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();
        inicializaAdaptador();

    }

    public MascotaAdaptador adaptador;
    public void inicializaAdaptador(){
        adaptador = new MascotaAdaptador(mascotas, this);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);

     }


    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.mascota1,getResources().getString(R.string.tvMascota1),getResources().getString(R.string.tvMas1Edad),getResources().getString(R.string.tvTelContactoMas1), (byte) 0));
        mascotas.add(new Mascota(R.drawable.mascota2,getResources().getString(R.string.tvMascota2),getResources().getString(R.string.tvMas2Edad),getResources().getString(R.string.tvTelContactoMas2), (byte) 0));
        mascotas.add(new Mascota(R.drawable.mascota3,getResources().getString(R.string.tvMascota3),getResources().getString(R.string.tvMas3Edad),getResources().getString(R.string.tvTelContactoMas3), (byte) 0));
        mascotas.add(new Mascota(R.drawable.mascota4,getResources().getString(R.string.tvMascota4),getResources().getString(R.string.tvMas4Edad),getResources().getString(R.string.tvTelContactoMas4), (byte) 0));
        mascotas.add(new Mascota(R.drawable.mascota5,getResources().getString(R.string.tvMascota5),getResources().getString(R.string.tvMas5Edad),getResources().getString(R.string.tvTelContactoMas5), (byte) 0));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_op, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.mStar:
                Intent intent = new Intent(this, StarMascotas.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
