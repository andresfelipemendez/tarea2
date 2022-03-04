package com.areandinaTests;

import com.areandina.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacturaTest {

    @Test
    void addItem() {
        Factura factura = new Factura(
                new Asesor("Asesor1"), new Cliente("Cliente1")
        );
        factura.agregarProducto(new Producto("producto1", 1500));

        assertNotNull(factura.getProductos());
    }

    @Test
    void imprimir() {
        Factura factura = new Factura(
            new Asesor("Asesor1"), new Cliente("Cliente1")
        );

        assertTrue(factura.Imprimir().contains("Asesor"));
        assertTrue(factura.Imprimir().contains("Asesor1"));

        assertTrue(factura.Imprimir().contains("Cliente"));
        assertTrue(factura.Imprimir().contains("Cliente1"));
    }
}