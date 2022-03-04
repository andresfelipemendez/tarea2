package com.areandina;

public class Main {

    public static void main(String[] args) {

        Factura factura = new Factura(
                new Asesor("Asesor1"),
                new Cliente("Cliente1")
        );

        System.out.printf(factura.Imprimir());
    }
}
