package com.designPatterns.Builder;

public class Main {
    public static void main(String[] args) {

        // Instanciamos un objeto Shoes utilizando el constructor por defecto y luego seteamos sus atributos utilizando los métodos set, lo cual es una forma tradicional de crear objetos, pero puede ser tediosa y propensa a errores si el objeto tiene muchos atributos o si se requiere una construcción más compleja.
        Shoes shoe1 = new Shoes();
        shoe1.setMarca("Nike");
        shoe1.setModelo("Air Max");
        shoe1.setTalla(42);

        System.out.println("Shoe 1: " + shoe1.getMarca() + ", " + shoe1.getModelo() + ", Talla: " + shoe1.getTalla());

        // Instanciamos un objeto Shoes utilizando el patrón Builder, lo cual nos permite construir el objeto de manera más fluida y legible, ya que podemos encadenar las llamadas a los métodos del Builder para agregar los atributos necesarios y luego llamar al metodo build() para obtener el objeto construido.
        Shoes shoe2 = new ShoesBuilder("Adidas").setModelo("Ultraboost").setTalla(40).build();

        System.out.println("Shoe 2: " + shoe2.getMarca() + ", " + shoe2.getModelo() + ", Talla: " + shoe2.getTalla());
    }

}
