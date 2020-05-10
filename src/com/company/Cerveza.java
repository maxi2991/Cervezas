package com.company;

public abstract class Cerveza {
    private int id;
    private String name;
    private float precio;
    private float ABV;
    private String descripcion;

    public Cerveza(int id, String name, float precio, float ABV, String descripcion) {
        this.id = id;
        this.name = name;
        this.precio = precio;
        this.ABV = ABV;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract float calcularCostoFabricacion();

    @Override
    public String toString() {
        return "ID: " + id + " " + name + " " + precio + " " + ABV + " " + descripcion;
    }


}
