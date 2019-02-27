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
public class TravelingSalesman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      Cities[] acity = new Cities[10];     
      Route aRoute = new Route();
      acity[0] = new Cities("A",false,100,300);
      acity[1] = new Cities("B",false,200,130);
      acity[2] = new Cities("C",false,300,500);
      acity[3] = new Cities("D",false,500,390);
      acity[4] = new Cities("E",false,700,300);
      acity[5] = new Cities("F",false,900,600);
      acity[6] = new Cities("G",false,800,950);
      acity[7] = new Cities("H",false,600,560);
      acity[8] = new Cities("I",false,350,550);
      acity[9] = new Cities("J",false,270,350);
      
      aRoute.calculateDistance();
      
    }
    
}
