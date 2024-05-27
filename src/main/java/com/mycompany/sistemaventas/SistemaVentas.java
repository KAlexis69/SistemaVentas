package com.mycompany.sistemaventas;

import java.util.ArrayList;
import java.util.List;

public class SistemaVentas {

    public static void main(String[] args) {
        // Crear una lista de clientes
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Mayerli", "Alomoto", "mayerli@gmail.com", "Quito", 123456789));
        clientes.add(new Cliente("Alexandra", "Lema", "alexandra@gmail.com", "Atuntaqui", 987654321));
        clientes.add(new Cliente("Lionel", "Messi", "lionel@gmail.com", "Ibarra", 135792468));

        // Crear una lista de productos
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Camisa", 25.99, 10));
        productos.add(new Producto("Pantalón", 35.99, 8));
        productos.add(new Producto("Zapatos", 49.99, 5));

        // Crear una lista de ventas
        List<Venta> ventas = new ArrayList<>();
        ventas.add(new Venta(clientes.get(0), productos.get(0), 2));
        ventas.add(new Venta(clientes.get(1), productos.get(1), 1));
        ventas.add(new Venta(clientes.get(2), productos.get(2), 3));

        // Imprimir la información de los clientes
        System.out.println("Clientes:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        // Imprimir la información de los productos
        System.out.println("\nProductos:");
        for (Producto producto : productos) {
            System.out.println(producto);
        }

        // Imprimir la información de las ventas
        System.out.println("\nVentas:");
        for (Venta venta : ventas) {
            System.out.println(venta);
        }
    }
}
