package practice1_2;

public class Route {
    private City nextCity;
    private int cost;

    public Route(City nextCity, int cost) {
        this.nextCity = nextCity;
        this.cost = cost;
    }

    public Route(City nextCity) {
        this(nextCity, 0);
    }

    public City getNextCity() {
        return nextCity;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return nextCity.cityName + ": " + cost;
    }
}
