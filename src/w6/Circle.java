/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w6;

/**
 *
 * @author Administrator
 */
public class Circle extends Shape
{
    
    private double radius;
    Circle()
    {
        super();
        this.radius=1;
    }
    Circle(double radius)
    {
        super();
        this.radius=radius;
    }
    Circle(double aX,double aY,double slength,double swidth,double radius,String color,boolean filled)
    {
        super(aX,aY,slength,swidth,color,filled);
        this.setColor(color);
        this.setFilled(filled);
        this.radius=radius;
    }
    public void setRadius(double radius)
    {
        this.radius=radius;
    }
    public double getRadius()
    {
        return this.radius;
    }
    public double getArea()
    {
        return this.radius*this.radius*Pi;
    }
    public double getPerimeter()
    {
        return 2*this.radius*Pi;
    }
    public String toString()
    {
        String a=new String("This is a circle which radius is "+this.radius+ "meters");
        return a;
    }
    public boolean equals(Circle a)
    {
        if((this.getAX()==a.getAX())&&(this.getAY()==a.getAY())&&(this.getRadius()==a.getRadius())) return true;
        else return false;
    }
}
