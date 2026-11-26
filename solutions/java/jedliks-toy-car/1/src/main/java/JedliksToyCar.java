public class JedliksToyCar {
    int meters = 0;
    int battery = 100;
    public static JedliksToyCar buy() {
        JedliksToyCar car = new JedliksToyCar();
        return car;

    }

    public String distanceDisplay() {
        return "Driven " + meters + " meters";
    }

    public String batteryDisplay() {
        if(battery == 0){
            return "Battery empty";
        }
        return "Battery at " + battery + "%";
    }

    public void drive() {
        if(battery != 0){
          battery -= 1;  
          meters += 20;
        }
        
    }
}
