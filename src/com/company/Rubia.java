package com.company;

public class Rubia extends TipoCerveza {
    public Rubia(int id, String nombre, float precio, float ABV, String descrip, boolean gluten, Receta receta, float porcentajeComplejidad) {
        super(id, nombre, precio, ABV, descrip, gluten, receta, porcentajeComplejidad);
    }

    @Override
    public String toString() {

        return "Cerveza Rubia " + super.toString() + " Costo: " + calcularCostoFabricacion();
    }

    @Override
    public float calcularCostoFabricacion() {
        float costo = super.fabricarConSinGluten(super.getReceta(), super.isGluten());
        costo += costo*super.getPorcentajeComplejidad();
        return costo;
    }

}
