package com.burstpenny.oscarymigue.the100montaitos.Clases;

public class Pedido {
    private Alimento alimento;
    private int cantidad;

    public Pedido(Alimento alimento, int cantidad) {
        this.alimento = alimento;
        this.cantidad = cantidad;
    }

    public Pedido() {
        this.alimento = new Alimento();
        this.cantidad = 0;
    }

    public Alimento getAlimento() {
        return alimento;
    }

    public void setAlimento(Alimento alimento) {
        this.alimento = alimento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
