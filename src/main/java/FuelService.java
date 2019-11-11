public class FuelService {
    public int calculateDistance(int capacity, int consumption) {
        int distance = capacity * 100 / consumption;
        return distance;
    }
}
