public class FuelService {
    public int calculateDistance(int capacity, int consumption) {
        int kilometres = 100;
        int distance = capacity * kilometres / consumption;
        return distance;
    }
}
