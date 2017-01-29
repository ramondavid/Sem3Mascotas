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
 * Created by tomas vazquez on 23/01/2017.
 */

public class StarAdaptador extends RecyclerView.Adapter<StarAdaptador.StarMascotaViewHolder>{

    public StarAdaptador(ArrayList<Mascotae> starmascota){
        this.starmascota = starmascota;
    }

    ArrayList<Mascotae> starmascota;

    @Override
    public StarMascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota, parent, false);

        return new StarMascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(StarMascotaViewHolder starmascotaholder, int position) {

       final Mascotae starMascotas = starmascota.get(position);

            starmascotaholder.cvImgMasc.setImageResource(starMascotas.getFoto());
            starmascotaholder.cvtvNombre.setText(starMascotas.getNombre());
            starmascotaholder.cvtvEdad.setText(starMascotas.getEdad());
            starmascotaholder.cvtvTel.setText(starMascotas.getTelefono());
            starmascotaholder.cvtvLikes.setText(starMascotas.getLikes());



    }

    @Override
    public int getItemCount() {

        return starmascota.size();
    }

    public static class StarMascotaViewHolder extends RecyclerView.ViewHolder {

        private ImageView cvImgMasc;
        private TextView cvtvNombre;
        private TextView cvtvEdad;
        private TextView cvtvTel;
        private TextView cvtvLikes;

        public StarMascotaViewHolder(View itemView) {
            super(itemView);

            cvImgMasc = (ImageView) itemView.findViewById(R.id.cvImgMasc);
            cvtvNombre = (TextView) itemView.findViewById(R.id.tvNombre);
            cvtvEdad = (TextView) itemView.findViewById(R.id.cvtvEdad);
            cvtvTel = (TextView) itemView.findViewById(R.id.cvtvTel);
            cvtvLikes = (TextView) itemView.findViewById(R.id.cvtvLikes);
        }

    }

}
