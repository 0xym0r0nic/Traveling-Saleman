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
    
    //get the distance between 2 cities
    public double getDistance(Cities current,Cities neighbor)
    {//Change this method to the distance formula, right now its the slope
        //distance formula is sqrt((x2-x1)^2+(y2-y1)^2)
        //make sure to add import.lang.Math
        //Also Make sure Math.sqrt(Math.abs()); to ensure always positive and distance formula works!
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
        Cities tempCity = new Cities(current);   
        int i=0;
        
        //by default assume shortest distance leads to city A.
        if(current.equals(neighbors[i]) == false)//when checking city not A
            shortestDistance = getDistance(tempCity, neighbors[0]);
        else//this is for the first case of searching for shortest distance
            shortestDistance = getDistance(tempCity, neighbors[i+1]);
       
        for (Cities neighbor : neighbors) 
        {
            if (neighbor.getVisit() == false)
            {
                if(current.equals(neighbor) == false)
                {
                    tempDis = getDistance(tempCity,neighbors[i]);
                    if(tempDis < shortestDistance)
                    {
                        shortestDistance = tempDis;
                        tempCity = neighbor;
                    }
                }
            } 
         i++;
        }
        current = new Cities(tempCity);        
        return shortestDistance;
    }    
    /* 
        Make the if statements their own methods to make things a little eaiser when putting everything together
        you are doing alright bud!
    */
}
