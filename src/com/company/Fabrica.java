package com.company;

import java.util.ArrayList;
import java.util.List;

public class Fabrica {
    private int id;
    private String name;
    private String direccion;
    private List<Cerveza> cervezas = new ArrayList<>();

    public Fabrica(int id, String name, String direccion) {
        this.id = id;
        this.name = name;
        this.direccion = direccion;
    }

    public void agregarCerveza(Cerveza nueva) {
        Cerveza aux = buscarCervezaNombre(nueva.getName());

        if (aux == null) {
            cervezas.add(nueva);
        }
    }

    public void quitarCerveza(Cerveza actual) {
        int indice = buscarCervezaID(actual.getId());
        if (indice != -1) {
            cervezas.remove(indice);
        }

    }

    public Cerveza buscarCervezaNombre(String name) {
        for (Cerveza c : cervezas) {
            if (c.getName().equals(name)) {
                return c;
            }
        }
        return null;
    }

    public int buscarCervezaID(int id) {
        for (int i = 0; i < cervezas.size(); i++) {
            if (id == cervezas.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }

    public void listarCervezas() {
        for (Cerveza c : cervezas) {
            if (c instanceof Roja) {
                System.out.println(c.toString());
            } else {
                if (c instanceof Negra) {
                    System.out.println(c.toString());
                } else {
                    if (c instanceof Rubia) {
                        System.out.println(c.toString());
                    }
                }
            }
        }


    }


    @Override
    public String toString() {
        return "Fabrica: " + name + " ID " + id + " direccion: " + direccion;
    }
}
