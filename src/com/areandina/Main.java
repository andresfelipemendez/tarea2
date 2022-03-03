package com.areandina;

public class Main {

    public static void main(String[] args) {

        Factura factura = new Factura();
        factura.asesor = new Asesor("Asesor1");
        factura.cliente = new Cliente("Cliente1");

        System.out.printf(factura.Imprimir());
    }
}
