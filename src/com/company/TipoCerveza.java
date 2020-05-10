package com.company;

public abstract class TipoCerveza extends Cerveza {
    private boolean gluten;
    private Receta receta;
    private float porcentajeComplejidad;

    public TipoCerveza(int id, String nombre, float precio, float ABV, String descrip, boolean gluten, Receta receta, float porcentajeComplejidad) {
        super(id, nombre, precio, ABV, descrip);
        this.gluten = gluten;
        this.receta = receta;
        this.porcentajeComplejidad = porcentajeComplejidad;
    }

    public boolean isGluten() {
        return gluten;
    }

    public void setGluten(boolean gluten) {
        this.gluten = gluten;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    public float getPorcentajeComplejidad() {
        return porcentajeComplejidad;
    }

    public void setPorcentajeComplejidad(float porcentajeComplejidad) {
        this.porcentajeComplejidad = porcentajeComplejidad;
    }

    @Override
    public String toString() {

        return super.toString() + " " + receta.toString() + " " + porcentajeComplejidad + " " + gluten;
    }


    public abstract float calcularCostoFabricacion();

    public float fabricarConSinGluten(Receta re, boolean glut) {
        float suma = 0;
        for (Ingrediente i : re.ingredientes) {
            suma += i.getCantidad() * i.getPrecio();
        }

        if (!glut) {

            suma = suma * 1.02f;
        }

        return suma;
    }


}
