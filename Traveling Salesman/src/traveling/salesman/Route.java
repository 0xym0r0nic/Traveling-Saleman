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
public class Route 
{
    private double Distance;
    private double shortestDistance;
    private double totalDistance = 0;
    private Cities[] visitTracker;
    private Cities current;
    
    //gets the distance between 2 cities
    public double getDistance(Cities current,Cities neighbor)
    {
        double x,y;
        x = neighbor.getx() - current.getx();
        y = neighbor.gety() - current.gety();
        x = x * x;
        y = y * y;
        
        Distance = Math.sqrt(Math.abs(x+y));
        return Distance;
    }
    
    //get the shortest distance between a city and its not visited neighbor
    public double getShortestDis(Cities current,Cities[] neighbors)
    {
        //tempDis will be used to check distaces 
        double tempDis;
        Cities tempCity = current;   
        int i=0;
        
        //by default assume shortest distance leads to city A.
        if(current.equals(neighbors[i]) == false)//when checking city not A
            shortestDistance = getDistance(tempCity, neighbors[0]);
        else//this is for the first case of searching for shortest distance
            shortestDistance = getDistance(tempCity, neighbors[i+1]);

        
       
        
        
        for (Cities neighbor : neighbors) 
        {
            if (current.equals(neighbor) == false)
            {
                if(neighbor.getVisit() == false)
                {
                    tempDis = getDistance(current,neighbors[i]);
                    if(tempDis <= shortestDistance)
                    {
                        shortestDistance = tempDis;
                        tempCity = neighbor;
                    }
                }
            } 
            i++;
        }
        
        current = tempCity;  
        current.setVisit(true);
        this.current = current;
        return shortestDistance;
       //System.out.println(current.getName()+ " Inside Shortest" + "Visited = " + current.getVisit());
    }  
    
    public void getAllDistances(Cities[] city)
    {
        for(int i =0;i<city.length;i++)
      {
          for (int j=0;j<city.length;j++)
          {
              if(i < j)
                System.out.println(city[i].getName()+ " " + city[j].getName() +" "+ getDistance(city[i], city[j]));
          }
      }
    }
    /*
    Use the getShortestDistance fucntion to find the closest city that has not been visited. if not visited
    */
    public Cities changeCurrrentCity(Cities acity)
    {
        //current.setVisit(true);
        //System.out.println("Current city = " + current.getName() + " Visited = " + current.getVisit());
        acity = current;
        return acity;
       
    }
}
