package com.areandina;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacturaTest {
    @Test
    void imprimir() {
        Factura factura = new Factura();
        factura.asesor = new Asesor("Asesor1");
        factura.cliente = new Cliente("Cliente1");

        assertTrue(factura.Imprimir().contains("Asesor"));
        assertTrue(factura.Imprimir().contains("Asesor1"));

        assertTrue(factura.Imprimir().contains("Cliente"));
        assertTrue(factura.Imprimir().contains("Cliente1"));
    }
}