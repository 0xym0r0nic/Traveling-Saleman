/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traveling.salesman;
import java.lang.Math;
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
      Cities[] aCity = new Cities[10];     
      Route aRoute = new Route();
      aCity[0] = new Cities("A",false,100,300);
      aCity[1] = new Cities("B",false,200,130);
      aCity[2] = new Cities("C",false,300,500);
      aCity[3] = new Cities("D",false,500,390);
      aCity[4] = new Cities("E",false,700,300);
      aCity[5] = new Cities("F",false,900,600);
      aCity[6] = new Cities("G",false,800,950);
      aCity[7] = new Cities("H",false,600,560);
      aCity[8] = new Cities("I",false,350,550);
      aCity[9] = new Cities("J",false,270,350);
      
      aRoute.getShortestDis(aCity[4], aCity);
    }
    
}
