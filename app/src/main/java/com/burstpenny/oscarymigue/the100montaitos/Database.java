package com.burstpenny.oscarymigue.the100montaitos;

import com.burstpenny.oscarymigue.the100montaitos.Clases.Alimento;
import com.burstpenny.oscarymigue.the100montaitos.Clases.Montadito;
import com.burstpenny.oscarymigue.the100montaitos.Clases.Pedido;
import com.burstpenny.oscarymigue.the100montaitos.Clases.Persona;

import java.util.ArrayList;

public class Database {

    public static ArrayList<Montadito> montaditos = new ArrayList<Montadito>() {
        {
            add(new Montadito(1, 1, 1, "Jamon gran reserva con aceite de oliva"));
            add(new Montadito(2, 1, 1, "Tortilla de patatas"));
            add(new Montadito(3, 1, 1, "Chori jam"));
            add(new Montadito(4, 1, 1, "Pulled pork"));
        }
    };
    public static ArrayList<Alimento> entrantes = new ArrayList<Alimento>() {
        {
            add(new Alimento(1, 2, "Patatas fritas 4 salsas"));
            add(new Alimento(1, 2, "Patatas fritas con queso y bacon"));
            add(new Alimento(1, 2, "Patatas fritas con queso y chorizo"));
            add(new Alimento(1, 2, "Aceitunas"));
            add(new Alimento(1, 2, "Nachos con queso y bacon"));
            add(new Alimento(1, 2, "Nachos con guacamole y queso"));
            add(new Alimento(1, 2, "Palomitas de pollo"));
            add(new Alimento(1, 2, "Salchichas 4 salsas"));
            add(new Alimento(1, 2, "Cucurucho de patatas"));
            add(new Alimento(1, 2, "Palomitas de queso"));
            add(new Alimento(2, 2, "Alitas de pollo"));
            add(new Alimento(2, 2, "Aros de cebolla BBQ"));
        }
    };
    public static ArrayList<Alimento> bebida = new ArrayList<Alimento>() {
        {
            add(new Alimento(1, 2, "Refresco"));
            add(new Alimento(1, 2, "Zumo"));
            add(new Alimento(1, 2, "Jarra de tinto de verano"));
            add(new Alimento(1, 2, "Caña cerveza"));
            add(new Alimento(1, 2, "Vaso cerveza"));
            add(new Alimento(1, 2, "Jarra cerveza"));
            add(new Alimento(1, 2, "Cruzcampo con/sin alcohol"));
            add(new Alimento(1, 2, "Jarra de ladrón de manzanas"));
            add(new Alimento(1, 2, "Copa de vino Buenos días Ribera de Duero"));
            add(new Alimento(1, 2, "Copa de vino Cune rosado Navarra"));
            add(new Alimento(1, 2, "Copa de vino Cune blanco Verdejo"));
            add(new Alimento(1, 2, "Copa de vino Cune tinto Crianza Rioja"));

        }
    };
    public static ArrayList<Alimento> ensaladas = new ArrayList<Alimento>() {
        {
            add(new Alimento(2, 2, "Ave César"));
            add(new Alimento(2, 2, "Campechana"));
            add(new Alimento(2, 2, "Montesa"));
            add(new Alimento(2, 2, "Ranchera"));
        }
    };

    public static ArrayList<Alimento> tablas = new ArrayList<Alimento>() {
        {
            add(new Alimento(5, 5, "La Troya"));
            add(new Alimento(5, 5, "Logroño"));
            add(new Alimento(5, 5, "Enriqueta"));
            add(new Alimento(5, 5, "Alberroncho"));
        }
    };

    public static ArrayList<Persona> personas = new ArrayList<Persona>() {{
        add(new Persona("Total", new ArrayList<Pedido>()));
    }};
}
