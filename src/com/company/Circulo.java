package com.company;

public class Circulo {

    private double radio;
    private double area;
    private double perimetro;

    public Circulo(double radio) {
        this.radio = radio;
        this.area = Math.PI * (radio*radio);
        this.perimetro = 2*Math.PI *radio;

    }

    public double getArea(){
        return area;
    }
    public void setRadio(double radio){
        this.radio = radio;
    }

    public double getPerimetro(){ return perimetro;}


}
