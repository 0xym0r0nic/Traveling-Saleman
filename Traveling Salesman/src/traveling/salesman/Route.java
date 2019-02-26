/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traveling.salesman;

import java.util.Arrays;
import java.util.ArrayList;
/**
 *
 * @author johnn
 */
public class Route {
   Cities[] city = new Cities[10];
   
   public void Cityin(Cities[] city)
   {
       for(int i=0;i<city.length;i++)
       {
           city[i] = new Cities();
       }
   }
  
}
