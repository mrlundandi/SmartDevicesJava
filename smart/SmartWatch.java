package com.company.smart;

public class SmartWatch {

    //1. atributos
    String marca;
    String modelo;
    String sw;
    boolean waterresist;
    double precio;
    double peso;
    double    ram;

    //2. constructores
    public SmartWatch(){

    }
    public SmartWatch(String marca, String modelo, String sw, boolean waterresist, double precio,double peso, double ram ){
        this.marca = marca;
        this.modelo = modelo;
        this.sw =sw;
        this.waterresist = waterresist;
        this.precio = precio;
        this.peso = peso;
        this.ram = ram;

    }



}
