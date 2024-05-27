package com.mycompany.sistemaventas;

public class Venta {
    private Cliente cliente;
    private Producto producto;
    private int cantidad;

    public Venta(Cliente cliente, Producto producto, int cantidad) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "cliente=" + cliente +
                ", producto=" + producto +
                ", cantidad=" + cantidad +
                '}';
    }
}
