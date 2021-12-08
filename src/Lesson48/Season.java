package Lesson48;

public enum Season {
    SUMMER(25), AUTUMN(5), WINTER(-10), SPRING(7);

    private int temperature;

    Season(int temperature){
        this.temperature = temperature;
    }

    public int getTemperature(){
        return temperature;
    }
}
