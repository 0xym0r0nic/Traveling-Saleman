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
    private double totalDistance = 0;
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
        //tempDis will be used to check distaces 
        double tempDis;
        Cities tempCity = new Cities(current);   
        int i=0;
        
        //by default assume shortest distance leads to city A.
        if(tempCity.equals(neighbors[i]))//when checking city not A
            shortestDistance = getDistance(tempCity, neighbors[0]);
        else//this is for the first case of searching for shortest distance
            shortestDistance = getDistance(tempCity, neighbors[1]);
        
        for (Cities neighbor : neighbors) 
        {
            if(neighbor.getVisit() == false)
            {
                if (neighbor.getVisit() == false)
                {
                    if(tempCity.equals(neighbor) == false)
                    {
                        tempDis = getDistance(tempCity,neighbors[i]);
                        if(tempDis < shortestDistance)
                        {
                            shortestDistance = tempDis;
                            tempCity = neighbor;
                        }
                    }
                }
            }
            i++;
        }
        current = new Cities(tempCity);
        System.out.println(tempCity.getName());
       
        
        return shortestDistance;
    }    
}
