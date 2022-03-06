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

        factura.agregarProducto(new Producto("Producto1", 1500));
        factura.agregarProducto(new Producto("Producto2", 2500));

        assertNotNull(factura.getProductos());
        assertEquals(2, factura.getProductos().size());
        
        assertTrue(factura.Imprimir().contains("Producto1"));
        assertTrue(factura.Imprimir().contains("Producto2"));
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