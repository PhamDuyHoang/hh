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
public class Diagram {
    private Vector<Layer> obj;
    Diagram()
    {
        this.obj=new Vector<>();
    }
    public void addLayer(Layer a)
    {
        this.obj.add(a);
    }
    public void deleteCircle()
    {
        for(int i=0;i<obj.size();i++)
        {
            Layer a=obj.elementAt(i);
            a.deleteCircle();
            obj.remove(i);
            obj.add(i,a);
        }
    }
    public int size()
    {
        return obj.size();
    }
    public void classify()
    {
        Layer circle=new Layer();
        Layer rec=new Layer();
        Layer square=new Layer();
        Layer triangle=new Layer();
        Layer hex=new Layer();
        for(int i=0;i<this.size();i++)
        {
            for(int j=0;j<obj.elementAt(i).size();j++)
            {
                if(obj.elementAt(i).getObj().elementAt(j) instanceof Circle) circle.addShape(obj.elementAt(i).getObj().elementAt(j));
                if(obj.elementAt(i).getObj().elementAt(j) instanceof Square) square.addShape(obj.elementAt(i).getObj().elementAt(j));
                if(obj.elementAt(i).getObj().elementAt(j) instanceof Rectangle) rec.addShape(obj.elementAt(i).getObj().elementAt(j));
                if(obj.elementAt(i).getObj().elementAt(j) instanceof Triangle) triangle.addShape(obj.elementAt(i).getObj().elementAt(j));
                if(obj.elementAt(i).getObj().elementAt(j) instanceof Hexagon) hex.addShape(obj.elementAt(i).getObj().elementAt(j));
            }
        }
        this.obj.removeAllElements();
        if(circle.size()>0) obj.add(circle);
        if(rec.size()>0) obj.add(rec);
        if(hex.size()>0) obj.add(hex);
        if(square.size()>0) obj.add(square);
        if(triangle.size()>0) obj.add(triangle);
    }
}
