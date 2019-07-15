package com.burstpenny.oscarymigue.the100montaitos.Clases;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private ArrayList<Pedido> pedido;

    public Persona(String nombre, ArrayList<Pedido> pedido) {
        this.nombre = nombre;
        this.pedido = pedido;
    }

    public Persona() {
        this.nombre = "";
        this.pedido = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Pedido> getPedido() {
        return pedido;
    }

    public void setPedido(ArrayList<Pedido> pedido) {
        this.pedido = pedido;
    }
}
