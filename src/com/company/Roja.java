package com.company;

public class Roja extends TipoCerveza {

    public Roja(int id, String nombre, float precio, float ABV, String descrip, boolean gluten, Receta receta, float porcentajeComplejidad) {
        super(id, nombre, precio, ABV, descrip, gluten, receta, porcentajeComplejidad);
    }

    @Override
    public String toString() {

        return "Cerveza Roja " + super.toString() + " Costo: " + calcularCostoFabricacion();
    }

    @Override
    public float calcularCostoFabricacion() {
        float costo = super.fabricarConSinGluten(super.getReceta(), super.isGluten());
        costo += costo*super.getPorcentajeComplejidad();
        return costo;
    }
}
