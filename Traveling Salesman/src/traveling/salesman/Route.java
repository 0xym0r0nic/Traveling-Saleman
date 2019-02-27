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
public class Route 
{
    private double shortestDistance;
    private double totalDistance;
    private Cities[] visitTracker = new Cities[10];
    private boolean isVisited = true;
    private Cities currentCity;
    private Cities startCity;
    private Cities nearestNeighbor = new Cities();
    
    
    public void initializeCities(Cities[] city)
    {
        for(int i=0;i<city.length;i++)
        {
            city[i] = new Cities();
        }
    }
    public void changeVisit(Cities aCity)
    {
        if(aCity == startCity)
            aCity.setVisit(false);
        else 
            aCity.setVisit(isVisited);
    }
    public void setCurrentCity()
    {
        if(startCity == null)
        {
            currentCity = startCity;
        }
        else
        {
            currentCity = nearestNeighbor;
        }
    }
    public void setNearestNeighbor()
    {
        
    }
    public void setStartCity(Cities startCity)
    {
        this.startCity = startCity;
    }
    public void calculateDistance()
    {
        
    }
 }
