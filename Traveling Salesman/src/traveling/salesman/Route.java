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
public class Route 
{
    private double Distance;
    private double shortestDistance;
    private double totalDistance;
    private Cities[] visitTracker;
    
    //get the distance between 2 cities
    public double getDistance(Cities current,Cities neighbor)
    {
        double x,y;
        x = neighbor.getx() - current.getx();
        y = neighbor.gety() - current.gety();
        Distance = y/x;
        if(Distance < 0)
            Distance = Distance * -1;
        return Distance;
    }
    //get the shortest distance between a city and its not visited neighbor
    public double getShortestDis(Cities current,Cities[] neighbors)
    {
        //temp will be used to check distaces 
        double temp;
        
        int i=0;
        //by default assume shortest distance leads to city A.
        shortestDistance = getDistance(current, neighbors[0]);
        for (Cities neighbor : neighbors) 
        {
            if(current != neighbor)
            {
                if(neighbor.getVisit() == false)
                {
                    if (neighbor.getVisit() == false)
                    {
                        temp = getDistance(current,neighbors[i]);
                        if(temp < shortestDistance);
                    }
                }
                
            }
            i++;
        }
        return shortestDistance;
    }    
}
