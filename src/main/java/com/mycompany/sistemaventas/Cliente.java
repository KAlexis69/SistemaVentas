package com.mycompany.sistemaventas;

public class Cliente {
    private String nombre;
    private String apellido;
    private String correo;
    private String direccion;
    private int telefono;

    public Cliente(String nombre, String apellido, String correo, String direccion, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
