/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w6;
import java.util.*;
/**
 *
 * @author Administrator
 */
public class Layer {
    private Vector<Shape> obj;

    public Vector<Shape> getObj() {
        return obj;
    }

    public void setObj(Vector<Shape> obj) {
        this.obj = obj;
    }
    private boolean visible;

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    Layer()
    {
        obj=new Vector<>();
        visible=true;
    }
    void addShape(Shape a)
    {
        this.obj.add(a);
    }
    void deleteTriangle()
    {
        int i=0;
        while(i<this.obj.size())
        {
            if(this.obj.elementAt(i) instanceof Triangle)
            {
                this.obj.remove(i);
            }
            else i++;
        }
    }
    void deleteCircle()
    {
        int i=0;
        while(i<this.obj.size())
        {
            if(this.obj.elementAt(i) instanceof Circle)
            {
                this.obj.remove(i);
            }
            else i++;
        }
    }
    void identical()
    {
        int i=0;
        while(i<obj.size())
        {
            int check=0;
            int j=0;
            while(j<obj.size()&&check==0)
            {
                if((j!=i)&&(obj.elementAt(i) instanceof Circle)&&(obj.elementAt(j) instanceof Circle))
                {
                    Circle a=(Circle) obj.elementAt(i);
                    Circle b=(Circle) obj.elementAt(j);
                    if(a.equals(b)) check=1;
                    else j++;
                }
                if((j!=i)&&(obj.elementAt(i) instanceof Hexagon)&&(obj.elementAt(j) instanceof Hexagon))
                {
                    Hexagon a=(Hexagon) obj.elementAt(i);
                    Hexagon b=(Hexagon) obj.elementAt(j);
                    if(a.equals(b)) check=1;
                    else j++;
                }
                else if((j!=i)&&(obj.elementAt(i) instanceof Rectangle)&&(obj.elementAt(j) instanceof Rectangle))
                {
                    Rectangle a=(Rectangle) obj.elementAt(i);
                    Rectangle b=(Rectangle) obj.elementAt(j);
                    if(a.equals(b)) check=1;
                    else j++;
                }
                else if((j!=i)&&(obj.elementAt(i) instanceof Square)&&(obj.elementAt(j) instanceof Square))
                {
                    Square a=(Square) obj.elementAt(i);
                    Square b=(Square) obj.elementAt(j);
                    if(a.equals(b)) check=1;
                    else j++;
                }
                else if((j!=i)&&(obj.elementAt(i) instanceof Triangle)&&(obj.elementAt(j) instanceof Triangle))
                {
                    Triangle a=(Triangle) obj.elementAt(i);
                    Triangle b=(Triangle) obj.elementAt(j);
                    if(a.equals(b)) check=1;
                    else j++;
                }
                else j++;
            }
            if(check==1) obj.remove(i);
            else i++;
            
        }
    }
    int size()
    {
        return obj.size();
    }
    
}
