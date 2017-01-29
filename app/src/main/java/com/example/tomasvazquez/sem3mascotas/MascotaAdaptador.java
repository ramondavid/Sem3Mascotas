package com.example.tomasvazquez.sem3mascotas;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.example.tomasvazquez.sem3mascotas.R.id.btnLike;
import static com.example.tomasvazquez.sem3mascotas.R.id.cvtvLikes;
import static com.example.tomasvazquez.sem3mascotas.R.id.rvMascotas;
import static com.example.tomasvazquez.sem3mascotas.R.id.textinput_counter;

/**
 * Created by tomas vazquez on 22/01/2017.
 */

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder> {

    ArrayList<Mascota> mascotas;
    Activity activity;



    public MascotaAdaptador(ArrayList<Mascota> mascotas, Activity activity){
        this.mascotas = mascotas;
        this.activity = activity;
    }

    public MascotaAdaptador(ArrayList<Mascota> mascotas) {
        this.mascotas=mascotas;
    }


    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota,parent,false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final MascotaViewHolder mascotaViewHolder, int position) {
        final Mascota mascota = mascotas.get(position);

        mascotaViewHolder.btnLike.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mascotaViewHolder.i = mascotaViewHolder.i + 1;
                Toast.makeText(activity, "Diste Like a " + mascota.getNombre(),Toast.LENGTH_SHORT).show();
                mascotaViewHolder.cvtvLikes.setText(Integer.toString(mascotaViewHolder.i));
            }

        });

        mascotaViewHolder.cvImgMasc.setImageResource(mascota.getFoto());
        mascotaViewHolder.cvtvNombre.setText(mascota.getNombre());
        mascotaViewHolder.cvtvEdad.setText(mascota.getEdad());
        mascotaViewHolder.cvtvTel.setText(mascota.getTelefono());

        mascotaViewHolder.cvImgMasc.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
            Toast.makeText(activity, mascota.getNombre(),Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(activity, DetalleMascota.class);
            intent.putExtra("pImagen", mascota.getFoto());
            intent.putExtra("pNombre", mascota.getNombre());
            intent.putExtra("pEdad", mascota.getEdad());
            intent.putExtra("pTelefono", mascota.getTelefono());
            activity.startActivity(intent);
        }
        });

    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder{

        private ImageView cvImgMasc;
        private TextView cvtvNombre;
        private TextView cvtvEdad;
        private TextView cvtvTel;
        private ImageButton btnLike;
        private TextView cvtvLikes;
        int i = 0;

        public MascotaViewHolder(View itemView) {
            super(itemView);
            cvImgMasc = (ImageView) itemView.findViewById(R.id.cvImgMasc);
            cvtvNombre = (TextView) itemView.findViewById(R.id.cvtvNombre);
            cvtvEdad = (TextView) itemView.findViewById(R.id.cvtvEdad);
            cvtvTel = (TextView) itemView.findViewById(R.id.cvtvTel);
            btnLike = (ImageButton) itemView.findViewById(R.id.btnLike);
            cvtvLikes = (TextView) itemView.findViewById(R.id.cvtvLikes);
        }


    }


}
