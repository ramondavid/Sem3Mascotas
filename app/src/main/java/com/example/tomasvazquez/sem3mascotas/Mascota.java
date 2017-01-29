package com.example.tomasvazquez.sem3mascotas;


public class Mascota {

    private String nombre;
    private String edad;
    private String telefono;


    private byte likes;

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    private int foto;


    public Mascota(int foto, String nombre, String edad, String telefono) {
        this.foto = foto;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }


    public byte getLikes() {
        return likes;
    }

    public void setLikes(byte likes) {
        this.likes = likes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
