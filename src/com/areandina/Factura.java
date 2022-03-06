package com.areandina;

import java.util.*;

public class Factura extends Precio {
    private Asesor asesor;
    private Cliente cliente;
    private List<Producto> productos = new ArrayList<>();
    
    private int witdh = 30;

    public Factura(Asesor asesor, Cliente cliente) {
        this.asesor = asesor;
        this.cliente = cliente;
    }

    public String Imprimir()  {
        StringBuilder output = new StringBuilder();

        AsesorYCliente(output);
        Productos(output);

        output.append("\n");
        printDivider(output);
        output.append("\n");
        output.append("Total");
        output.append("\t\t");
        output.append(getTotal());


        return output.toString();
    }

    private void printDivider(StringBuilder output) {
        StringBuilder divider = new StringBuilder();
        for (int i = 0; i < witdh; i++) {
            divider.append("-");
        }
        output.append(divider);
    }

    private int getTotal() {
        int total = 0;
        for (Producto producto: productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    private void Productos(StringBuilder output) {
        StringBuilder line = new StringBuilder();
        for (Producto producto: productos) {
            line.append("\n");
            line.append(producto.getNombre());
            line.append("\t");
            line.append(producto.getPrecio());
        }
        output.append(line);
    }

    private void AsesorYCliente(StringBuilder output) {
        output.append("Cliente: ");
        output.append(cliente.getNombre());
        output.append("\n");
        output.append("Asesor: ");
        output.append(asesor.getNombre());
    }

    public void agregarProducto(Producto producto) {
       this.productos.add(producto);
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
