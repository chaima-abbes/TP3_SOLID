package ISP;


public class DoorTest {
    public static void main(String[] args) {
        Timer timer = new Timer();
        Sensor sensor = new Sensor();
        
        Door timedDoor = new TimedDoor(timer);
        Door sensingDoor = new SensingDoor(sensor);
        Door advancedDoor = new AdvancedDoor(timer, sensor);
        
        testBasicDoorFunctionality(timedDoor);
        testBasicDoorFunctionality(sensingDoor);
        testBasicDoorFunctionality(advancedDoor);
    }
    
    private static void testBasicDoorFunctionality(Door door) {
        door.unlock();
        door.open();
        door.close();
        door.lock();
    }
}
