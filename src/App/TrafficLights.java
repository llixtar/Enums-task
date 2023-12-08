package App;

public enum TrafficLights {

    RED("Stop"),
    YELLOW("Ready to move"),
    GREEN("Move");

    // Поле


    // Поле
    private final String color;

    // Конструктор
    TrafficLights(String color) {
        this.color = color;
    }

    // Метод
    public String getDirect() {
        return this.color;
    }
}
