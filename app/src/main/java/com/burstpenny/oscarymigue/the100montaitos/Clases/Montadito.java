package com.burstpenny.oscarymigue.the100montaitos.Clases;

public class Montadito extends Alimento {
    private int id;

    public Montadito(int id, double precioXD, double precioLMJVS, String nombre) {
        super(precioXD, precioLMJVS, nombre);
        this.id = id;
    }

    public Montadito() {
        super();
        this.id = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
