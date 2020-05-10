package com.company;

public class Ingrediente {
    private int id;
    private String name;
    private String descripcion;
    private float cantidad;
    private float precio;

    public Ingrediente(int id, String name, String descripcion, float cantidad, float precio) {
        this.id = id;
        this.name = name;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ID: " + id + " " + name + " " + descripcion + " " + cantidad + " " + precio;

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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingrediente nuevo = (Ingrediente) o;
        return this.id == nuevo.id;
    }


}
