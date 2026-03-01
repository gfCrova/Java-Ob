package com.designPatterns.Creatives.Builder;
/*
* // El patron Builder se caracteriza por retornar el mismo objeto para poder encadenar las llamadas a los métodos y asi construir el objeto de manera fluida.
* */
public class ShoesBuilder {

    Shoes shoe;

    // El constructor del Builder recibe los parámetros necesarios para construir el objeto, en este caso la marca de los zapatos, y luego se pueden ir agregando los demás atributos a traves de los métodos del Builder.
    public ShoesBuilder(String marca){
        shoe = new Shoes();
        shoe.setMarca(marca);
    }

    public ShoesBuilder setModelo(String modelo){
        shoe.setModelo(modelo);
        return this;
    }

    public ShoesBuilder setTalla(int talla){
        shoe.setTalla(talla);
        return this;
    }

    // El metodo build() es el encargado de retornar el objeto construido, en este caso el objeto Shoes, una vez que se han agregado todos los atributos necesarios a traves de los métodos del Builder.
    public Shoes build() {
        return this.shoe;
    }
}
