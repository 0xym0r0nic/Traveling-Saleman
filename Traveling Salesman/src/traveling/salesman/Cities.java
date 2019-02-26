/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traveling.salesman;

/**
 *
 * @author johnn
 */
public class Cities
{
     private String name;
     private boolean visit;
     private int x;
     private int y;

    public Cities(String name, boolean visit, int x, int y)
    {
        this.name = name;
        this.visit = visit;
        this.x = x;
        this.y = y;
    }
    public Cities()
    {
        this.name = null;
        this.x = 0;
        this.y = 0;
        this.visit = false;
    }
    public void setName(String name)
    {
        this.name =name;
    }
     public void setVisit(boolean visit)
     {
         this.visit = visit;
     }
     public String getName()
     {
         return name;
     }

     public boolean getVisit()
     {
         return visit;
     }

     public void makeString()
     {
         System.out.println("City =" + name + " Visted? " + visit);
     }
}