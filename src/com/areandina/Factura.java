package com.areandina;

public class Factura extends Precio {
    Asesor asesor;
    Cliente cliente;
    String Imprimir()  {
        StringBuilder output = new StringBuilder();
        output.append("Cliente: ");
        output.append(cliente.getNombre());
        output.append("\nAsesor: ");
        output.append(asesor.getNombre());
        return output.toString();
    }
}
