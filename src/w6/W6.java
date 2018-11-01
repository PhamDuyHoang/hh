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
public class W6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Diagram d1=new Diagram();
        Layer l1=new Layer();
        Rectangle a1=new Rectangle();
        Circle a2=new Circle();
        l1.addShape(a2);
        l1.addShape(a1);
        l1.deleteTriangle();
        System.out.println(l1.size());
    }
    
}
