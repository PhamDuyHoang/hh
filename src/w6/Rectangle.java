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
public class Rectangle extends Shape {
    private double width;
    private double length;
    Rectangle()
    {
        width=1;
        length=1;
    }
    Rectangle(double width,double length)
    {
        this.width=width;
        this.length=length;
    }
    Rectangle(double aX,double aY,double slength,double swidth,double width,double length,String color,boolean filled)
    {
        super(aX,aY,slength,swidth,color,filled);
        this.width=width;
        this.length=length;
    }
    void setWidth(double width)
    {
        this.width=width;
    }
    double getWidth()
    {
        return this.width;
    }
    void setLength(double length)
    {
        this.length=length;
    }
    double getLength()
    {
        return this.length;
    }
    public double getArea()
    {
        return this.length*this.width;
    }
    public double getPerimeter()
    {
        return (this.length+this.width)*2;
    }
    public String toString()
    {
        String a=new String("This is an rectangle having "+this.width+" meters wide and "+this.length+" meters long.");
        return a;
    }
    public boolean equals(Rectangle a)
    {
        if((this.getAX()==a.getAX())&&(this.getAY()==a.getAY())&&(this.getLength()==a.getLength())&&(this.getWidth()==a.getWidth())) return true;
        else return false;
    }
}
