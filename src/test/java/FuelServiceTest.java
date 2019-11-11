import static org.junit.jupiter.api.Assertions.*;

class FuelServiceTest {

    @org.junit.jupiter.api.Test
    void calculateDistance() {
        int capacity = 40;
        int consumption = 7;
        FuelService fuelService = new FuelService();
        int result = fuelService.calculateDistance(capacity, consumption);
        assertEquals(571, result);
    }
}