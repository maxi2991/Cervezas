package com.company;

import java.util.ArrayList;
import java.util.List;

public class Receta {
    private int id;
    private String name;
    private String pais;
    public List<Ingrediente> ingredientes = new ArrayList<>();

    public Receta(int id, String name, String pais) {
        this.id = id;
        this.name = name;
        this.pais = pais;
    }

    public void agregarIngrediente(Ingrediente nuevo) {
        ingredientes.add(nuevo);
    }

    public void quitarIngrediente(Ingrediente actual) {

        int indice = ingredientes.indexOf(actual);
        if (indice != -1) {
            ingredientes.remove(indice);
        }

    }

    public String toString() {

        return "ID: " + id + " " + name + " " + pais;
    }

    public void imprimirIngredientes() {

        for (Ingrediente i : ingredientes) {
            System.out.print(i.toString());
        }
    }


}
