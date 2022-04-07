package com.company.smart;

public class SmartDevice {

    public static void main(String[] args){

        // Clase identificador = new Clase()

        SmartPhone galaxyS21 = new SmartPhone("Samsung","S21", "Android", "Orange", 840.50d, 6);

        System.out.println(galaxyS21.marca);
        System.out.println(galaxyS21.modelo);
        System.out.println(galaxyS21.sw);
        System.out.println(galaxyS21.operador);
        System.out.println(galaxyS21.precio);
        System.out.println(galaxyS21.ram);

        SmartWatch galaxyWatch4 = new SmartWatch("Samsung", "Watch4", "Android Wear", true, 455.70d , 0.05d, 1.5d);

        System.out.println(galaxyWatch4.marca);
        System.out.println(galaxyWatch4.modelo);
        System.out.println(galaxyWatch4.sw);
        System.out.println(galaxyWatch4.waterresist);
        System.out.println(galaxyWatch4.precio);
        System.out.println(galaxyWatch4.peso);
        System.out.println(galaxyWatch4.ram);
    }
}
