package com.example.demo1;

public class Main {
    public static void main (String args[]) {
        Cliente cliente = new Cliente();
        cliente.nombre = "Vittorio";
        cliente.edad = 25;
        cliente.telefono = 123456;
        cliente.credito = 300;
        System.out.println("Su nombre es " + cliente.nombre);
        System.out.println("Y tiene " + cliente.edad + " años");
        System.out.println("Numero telefonico: " + cliente.telefono);
        System.out.println("Posee un credito de " + cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Marcos";
        trabajador.edad = 30;
        trabajador.telefono = 245921;
        trabajador.salario = 10000;

        System.out.println("El nombre del trabajador es " + trabajador.nombre);
        System.out.println("Su edad es " + trabajador.edad);
        System.out.println("Para contactarlo llame a " + trabajador.telefono);
        System.out.println("Su salario es de " + trabajador.salario);


    }

}

class Persona {
    int edad;
    String nombre;
    int telefono;

}

class Cliente extends Persona {
    int credito;
}

class Trabajador extends Persona {
    int salario;
}