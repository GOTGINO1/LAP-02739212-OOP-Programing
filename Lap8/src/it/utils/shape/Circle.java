package it.utils.shape;

import java.util.Scanner;

import java.util.Scanner;

public class Circle implements Shape{
    private double radius;

    @Override
    public void inputParameters(){
        System.out.println("** please input your circle **");
        System.out.print("Radius: ");
        this.radius = new Scanner(System.in).nextDouble();
    }
    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double r){
        this.radius = r;
    }
    public double getCircumference(){
        return 2*Math.PI*radius;
    }
}
