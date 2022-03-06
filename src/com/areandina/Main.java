package com.areandina;

public class Main {

    public static void main(String[] args) {

        Factura factura = new Factura(
                new Asesor("Asesor1"),
                new Cliente("Cliente1")
        );

        factura.agregarProducto(new Producto("Producto1",15000));
        factura.agregarProducto(new Producto("Producto2", 2500));

        System.out.printf(factura.Imprimir());
    }
}
