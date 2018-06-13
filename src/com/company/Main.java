package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        double radio = sc.nextDouble();

        Circulo c = new Circulo(radio);
        System.out.println(" el area del circulo es: " + c.getArea());
        System.out.println(" El perimetro es: " + c.getPerimetro());

    }
}
