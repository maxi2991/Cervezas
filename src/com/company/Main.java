package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Ingrediente ing1 = new Ingrediente(152, "azucar", "100mg", 10, 20);
        Ingrediente ing2 = new Ingrediente(122, "sal", "50mg", 50, 10);
        Ingrediente ing3 = new Ingrediente(148, "malta", "10mg", 15, 25);
        Ingrediente ing4 = new Ingrediente(177, "comino", "1mg", 25, 25);
        Ingrediente ing5 = new Ingrediente(155, "trigo", "150mg", 5, 15);
        Receta rece1 = new Receta(1250, "cupu1", "USA");
        Receta rece2 = new Receta(1150, "cupu2", "Austria");
        Receta rece3 = new Receta(1550, "cupu3", "Alemania");
        rece1.agregarIngrediente(ing1);
        rece1.agregarIngrediente(ing2);
        rece1.agregarIngrediente(ing3);
        rece2.agregarIngrediente(ing4);
        rece2.agregarIngrediente(ing5);
        rece2.agregarIngrediente(ing1);
        rece3.agregarIngrediente(ing3);
        rece3.agregarIngrediente(ing2);
        rece3.agregarIngrediente(ing4);
        Roja rojita = new Roja(22, "La Viva", 120, 15, "Saborizada", true, rece1, 0.15f);
        Negra negrita = new Negra(11, "La dulce", 150, 12, "colorante", false, rece2, 0.20f);
        Rubia rubi = new Rubia(15, "La Esplendida", 100, 10, "cevadita", true, rece3, 0.10f);
        Fabrica empresa=new Fabrica(15489,"Quilmes S.C","Calchaqui 234");
        empresa.agregarCerveza(rojita);
        empresa.agregarCerveza(negrita);
        empresa.agregarCerveza(rubi);

        //empresa.listarCervezas();

        //empresa.quitarCerveza(negrita);

        //empresa.listarCervezas();

        empresa.agregarCerveza(rojita);
        empresa.listarCervezas();

    }
}
