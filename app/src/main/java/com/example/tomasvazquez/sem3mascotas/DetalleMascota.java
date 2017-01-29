package com.example.tomasvazquez.sem3mascotas;

import android.content.Intent;
import android.renderscript.Byte2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleMascota extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_mascota);

        Toolbar miActionBar = (Toolbar)findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Bundle parametros = getIntent().getExtras();
        int pImagen = parametros.getInt("pImagen");
        String pNombre = parametros.getString("pNombre");
        String pEdad = parametros.getString("pEdad");
        String pTelefono = parametros.getString("pTelefono");

        ImageView imgMascota = (ImageView) findViewById(R.id.imgMascota);
        final TextView tvNombre = (TextView) findViewById(R.id.tvNombre);
        final TextView tvEdad = (TextView) findViewById(R.id.tvEdad);
        final TextView tvTelCon = (TextView) findViewById(R.id.tvTelCon);

        imgMascota.setImageResource(pImagen);
        tvNombre.setText(pNombre);
        tvEdad.setText(pEdad);
        tvTelCon.setText(pTelefono);
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
