public class Hangar {
    public static void main(String[] args) {
        Vehicle[] vehicleList = { new Car("Clio", 100000), new Boat("Zodiac", 300) };

        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle.doStuff());
        }
    }
}
