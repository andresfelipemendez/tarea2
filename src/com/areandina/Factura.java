package com.areandina;

import java.util.*;

public class Factura extends Precio {
    private Asesor asesor;
    private Cliente cliente;
    private List<Producto> productos = new ArrayList<>();

    public Factura(Asesor asesor, Cliente cliente) {
        this.asesor = asesor;
        this.cliente = cliente;
    }

    public String Imprimir()  {
        StringBuilder output = new StringBuilder();
        output.append("Cliente: ");
        output.append(cliente.getNombre());
        output.append("\nAsesor: ");
        output.append(asesor.getNombre());
        return output.toString();
    }

    public void agregarProducto(Producto producto) {
       // this.productos.add(producto);
    }

    public Asesor getAsesor() {
        return this.asesor;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public  List<Producto> getProductos(){
        return productos;
    }
}
