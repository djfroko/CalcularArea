package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        double radio = sc.nextDouble();

        Circulo c = new Circulo(radio);
        System.out.println(c.getArea());
        System.out.println(c.getPerimetro());

    }
}
