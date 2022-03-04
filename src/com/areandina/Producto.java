package com.areandina;

public class Producto {
    private final int precio;
    private final String nombre;

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
}
