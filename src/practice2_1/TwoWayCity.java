package practice2_1;

import practice1_2.City;
import practice1_2.Route;

import javax.management.openmbean.TabularData;
import java.util.List;

//2.1.3 Двусторонняя дорога. Создайте такой подвид сущности Город, полученной в задаче 1.6.9,
// которая будет гарантировать, что при добавлении дороги из одного города в другой, одновременно будет добавляться и обратная дорога.
public class TwoWayCity extends City{
    public TwoWayCity(String cityName, List<Route> routes) {
        super(cityName, routes);
    }

    public TwoWayCity(String cityName, Route... routes) {
        super(cityName, routes);
    }

    @Override
    public void addRoute(City nextCity, int cost){
        super.addRoute(nextCity, cost);
        if (nextCity != null && !nextCity.hasRoute(this, cost)) {
            nextCity.addRoute(this, cost);
        }
    }

    @Override
    public void removeRoute(City nextCity){
        super.removeRoute(nextCity);
        if (nextCity !=null && nextCity.hasRoute(this, 0)){
            nextCity.removeRoute(this);
        }
    }

}
