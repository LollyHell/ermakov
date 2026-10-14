package practice1_2;
import java.util.ArrayList;
import java.util.List;
//1.3.3. Города. Создайте сущность Город,
// которая будет представлять собой точку на карте со следующими характеристиками:
//•	Название города
//•	Набор путей к следующим городам, где путь представляет собой сочетание Города и стоимости поездки в него.
//Кроме того, Город может возвращать текстовое представление, в виде названия
// города и списка связанных с ним городов (в виде пары: “название: стоимость”).
public class City {
    String cityName;
    private List<Route>routes;

    public City(String cityName, List<Route> routes) {

        if (cityName == null || cityName.isBlank()){
            throw new IllegalArgumentException("Не задано название города");
        }
        this.cityName = cityName;
        if (routes == null){
            routes = new ArrayList<>();
        }
        this.routes = new ArrayList<>(routes);
    }

    public City(String cityName, Route ...routes) {
        this(cityName, List.of(routes) != null ? List.of(routes) : null);
    }

    public void addRoute(City nextCity, int cost){
        if (nextCity == null){
            return;
        }
        for (int i = 0; i < routes.size(); i++){
            if (routes.get(i).getNextCity() == nextCity){
                routes.get(i).setCost(cost);
                return;
            }
        }
        routes.add(new Route(nextCity, cost));
    }

    public void removeRoute(City nextCity){
        if (nextCity == null) return;
        for (int i = 0; i < routes.size(); i++){
            if (routes.get(i).getNextCity() == nextCity) {
                routes.remove(i);
                return;
            }
        }
    }

    public boolean hasRoute(City city, int cost){
        if (city == null) return false;
        for (int i = 0; i < routes.size(); i++){
            if (routes.get(i).getNextCity() == city && routes.get(i).getCost() == cost){
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return cityName + routes;
    }
}
//1.6.9 Дороги. Измените сущности из задачи 1.3.3. Гарантируйте, что между двумя городами
// может быть только одна прямая дорога (другой путь может быть проложен только транзитом через другие города).
//Города можно создавать с указанием заранее заданных путей, в любой момент времени можно
// добавить новую дорогу в любой город и удалить имеющуюся дорогу.
//При добавлении второй дороги в уже имеющийся путь она не добавляется, а обновляет стоимость пути.