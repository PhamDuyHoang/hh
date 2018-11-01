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
public class Square extends Rectangle {
    Square()
    {
        super();
    }
    Square(double side)
    {
        super(side,side);
    }
    Square(double aX,double aY,double slength,double swidth,double side,String color,boolean filled)
    {
        super(aX,aY,slength,swidth,side,side,color,filled);
    }
    void setSide(double side)
    {
        super.setLength(side);
        super.setWidth(side);
    }
    double getSide()
    {
        return super.getLength();
    }
    void setWidth(double side)
    {
        super.setWidth(side);
    }
    @Override
    void setLength(double side)
    {
        super.setLength(side);
    }
    public String toString()
    {
        String a=new String("This is a square which side is "+this.getSide()+" meters");
        return a;
    }
    public boolean equals(Square a)
    {
        return super.equals(a);
    }
    
}
