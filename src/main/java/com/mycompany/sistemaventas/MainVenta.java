package com.mycompany.sistemaventas;

import java.util.ArrayList;
import java.util.List;

public class MainVenta {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Mayerli", "Alomoto", "mayerli@gmail.com", "Quito", 123456789));
        clientes.add(new Cliente("Alexandra", "Lema", "alexandra@gmail.com", "Atuntaqui", 987654321));
        clientes.add(new Cliente("Lionel", "Messi", "lionel@gmail.com", "Ibarra", 135792468));
        clientes.add(new Cliente("Fernando", "Alvarado", "fernando@gmail.com", "Cayambe", 987654321));
        clientes.add(new Cliente("María", "Pérez", "maria@gmail.com", "Quito", 123456789));

        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Camisa", 25.99, 10));
        productos.add(new Producto("Pantalón", 35.99, 8));
        productos.add(new Producto("Zapatos", 49.99, 5));
        productos.add(new Producto("Reloj", 99.99, 15));
        productos.add(new Producto("Gafas de sol", 45.99, 7));

        List<Venta> ventas = new ArrayList<>();
        ventas.add(new Venta(clientes.get(0), productos.get(0), 2));
        ventas.add(new Venta(clientes.get(1), productos.get(1), 1));
        ventas.add(new Venta(clientes.get(2), productos.get(2), 3));
        ventas.add(new Venta(clientes.get(3), productos.get(3), 4));
        ventas.add(new Venta(clientes.get(4), productos.get(4), 5));

        for (Venta venta : ventas) {
            System.out.println(venta);
        }
    }
}
