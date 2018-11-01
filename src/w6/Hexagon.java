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
public class Hexagon extends Shape {
    private double side;
    Hexagon()
    {
        super();
        this.side=1;
    }
    Hexagon(double side)
    {
        super();
        this.side=side;
    }
    Hexagon(double aX,double aY,double slength,double swidth,double side,String color,boolean filled)
    {
        super(aX,aY,slength,swidth,color,filled);
        this.setColor(color);
        this.setFilled(filled);
        this.side=side;
    }
    public void setSide(double side)
    {
        this.side=side;
    }
    public double getSide()
    {
        return this.side;
    }
    
    public double getPerimeter()
    {
        return 6*this.side;
    }
    public String toString()
    {
        String a=new String("This is a hexagon which side is "+this.side+ "meters");
        return a;
    }
    public boolean equals(Hexagon a)
    {
        if((this.getAX()==a.getAX())&&(this.getAY()==a.getAY())&&(this.getSide()==a.getSide())) return true;
        else return false;
    }
    
}
