package com.campusdual.classroom;

public class Exercise02 {

    public static void main(String[] args) {
        double r = 15;
        double a, l;

        // ↓ Fórmula del área de un círculoS: Radio * radio * Pi
        a = Math.pow(r,2) * 3.14;


        System.out.println("Area: " + a);

        // ↓ Fórmula de la longitud de una circunferencia: 2 * radio * Pi
        l = 2 * r * 3.14;

        System.out.println("Longitud:  " + l);

    }
}
