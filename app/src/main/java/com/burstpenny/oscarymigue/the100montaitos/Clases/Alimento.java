package com.burstpenny.oscarymigue.the100montaitos.Clases;

public class Alimento {
    private double precioXD;
    private double precioLMJVS;
    private String nombre;

    public Alimento(double precioXD, double precioLMJVS, String nombre) {
        this.precioXD = precioXD;
        this.precioLMJVS = precioLMJVS;
        this.nombre = nombre;
    }

    public Alimento() {
        this.precioXD = 0;
        this.precioLMJVS = 0;
        this.nombre = "";
    }

    public double getPrecioXD() {
        return precioXD;
    }

    public void setPrecioXD(int precioXD) {
        this.precioXD = precioXD;
    }

    public double getPrecioLMJVS() {
        return precioLMJVS;
    }

    public void setPrecioLMJVS(int precioLMJVS) {
        this.precioLMJVS = precioLMJVS;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
