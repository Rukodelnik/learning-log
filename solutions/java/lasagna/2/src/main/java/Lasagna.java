public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }

    public int remainingMinutesInOven(int min){
        int allmin = expectedMinutesInOven(); 
        return  allmin - min;
    }

    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    public int totalTimeInMinutes(int layers, int min) {
        return (layers * 2) + min;
    }
}
