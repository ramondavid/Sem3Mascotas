package com.example.tomasvazquez.sem3mascotas;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by tomas vazquez on 29/01/2017.
 */

public class StarAdaptador extends RecyclerView.Adapter<StarAdaptador.StarAdaptadorViewHolder> {

    ArrayList<Mascota> starmascota;

    public StarAdaptador(ArrayList<Mascota> starmascota){
        this.starmascota = starmascota;

    }



    @Override
    public StarAdaptadorViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota, parent,false);

        return new StarAdaptadorViewHolder(v);
    }

    @Override
    public void onBindViewHolder(StarAdaptadorViewHolder staradaptadorViewHolder, int position) {

        Mascota stars = starmascota.get(position);

        staradaptadorViewHolder.cvImgMasc.setImageResource(stars.getFoto());
        staradaptadorViewHolder.cvtvNombre.setText(stars.getNombre());
        staradaptadorViewHolder.cvtvEdad.setText(stars.getEdad());
        staradaptadorViewHolder.cvtvTel.setText(stars.getTelefono());

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public static class StarAdaptadorViewHolder extends RecyclerView.ViewHolder{

        private ImageView cvImgMasc;
        private TextView cvtvNombre;
        private TextView cvtvEdad;
        private TextView cvtvTel;

        public StarAdaptadorViewHolder(View itemView) {
            super(itemView);
            cvImgMasc = (ImageView) itemView.findViewById(R.id.cvImgMasc);
            cvtvNombre = (TextView) itemView.findViewById(R.id.cvtvNombre);
            cvtvEdad = (TextView) itemView.findViewById(R.id.cvtvEdad);
            cvtvTel = (TextView) itemView.findViewById(R.id.cvtvTel);

        }
    }

}
