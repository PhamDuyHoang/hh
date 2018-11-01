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
public class Shape {
    private double aX;
    private double aY;
    private double slength;
    private double swidth;
    private String color;
    private boolean filled;
    public final double Pi=3.14;
    public Shape()
    {
        aX=0;
        aY=0;
        slength=1;
        swidth=1;
        color="Red";
        filled=true;
    }
    public Shape(double aX,double aY,double slength,double swidth,String color,boolean filled)
    {
        this.aX=aX;
        this.aY=aY;
        this.slength=slength;
        this.swidth=swidth;
        this.color=color;
        this.filled=filled;
    }
    public void setAX(double aX)
    {
        this.aX=aX;
    }
    public double getAX()
    {
        return this.aX;
    }
    public void setAY(double aY)
    {
        this.aY=aY;
    }
    public double getAY()
    {
        return this.aY;
    }
    public void setSlength(double slength)
    {
        this.slength=slength;
    }
    public double getSlength()
    {
        return this.slength;
    }
    public void setSwidth(double swidth)
    {
        this.swidth=swidth;
    }
    public double getSwidth()
    {
        return this.swidth;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    public String setColor()
    {
        return this.color;
    }
    public boolean isFilled()
    {
        return this.filled;
    }
    public void setFilled(boolean filled)
    {
        this.filled=filled;
    }
    public String toString()
    {
        String a=new String("Day la 1 hinh");
        return a;
    }
    
}
