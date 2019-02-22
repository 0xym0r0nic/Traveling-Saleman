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
     private int ID;
     private boolean visit;

    public Cities(String name, int ID, boolean visit)
    {
        this.name = name;
        this.ID = ID;
        this.visit = visit;
    }

    public void setName(String name)
    {
        this.name =name;
    }

    public void setID(int ID)
    {
        this.ID = ID;
    }
     public void setVisit(boolean visit)
     {
         this.visit = visit;
     }
     public String getName()
     {
         return name;
     }
     public int getID()
     {
         return ID;
     }

     public boolean getVisit()
     {
         return visit;
     }

     public void makeString()
     {
         System.out.println("City =" + name + " ID = " + ID + " Visted? " + visit);
     }
}