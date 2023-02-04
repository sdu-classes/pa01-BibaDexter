import java.util.*;
public class Circle{
    double radius;
    double PI = Math.PI;

    public Circle(){
        this.radius = 1.0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return PI*this.radius*this.radius;
    }
}