/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package traveling.salesman;

import java.util.ArrayList;

/**
 *
 * @author johnn
 */
public class TravelingSalesman
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City("A", false, 100, 300));
        cities.add(new City("B", false, 200, 130));
        cities.add(new City("C", false, 300, 500));
        cities.add(new City("D", false, 500, 390));
        cities.add(new City("E", false, 700, 300));
        cities.add(new City("F", false, 900, 600));
        cities.add(new City("G", false, 800, 950));
        cities.add(new City("H", false, 600, 560));
        cities.add(new City("I", false, 350, 550));
        cities.add(new City("J", false, 270, 350));
        City startingCity = cities.get(0);

        Route aRoute = new Route(startingCity);

        for (City ignored : cities)
        {
            aRoute.getShortestDis(startingCity, cities);
            startingCity = aRoute.getCurrrentCity();
        }
        
        aRoute.showVisitedCitiesOrder();
        aRoute.showTotalDistance();
    }    
}
