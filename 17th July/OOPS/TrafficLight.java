package OOPS;

public class TrafficLight {
    private String color;
    private int duration;

    public TrafficLight(String initialColor, int initialDuration) {
        color = initialColor;
        duration = initialDuration;
    }

    public String getColor() {
        return color;
    }

    public void changeColor(String newColor) {
        color = newColor;
    }

    public boolean isRed() {
        return color.equalsIgnoreCase("red");
    }

    public boolean isGreen() {
        return color.equalsIgnoreCase("green");
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int newDuration) {
        duration = newDuration;
    }
}
 class TrafficLightExample {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight("red", 60);

        System.out.println("Current Traffic Light Status:");
        System.out.println("Color: " + trafficLight.getColor());
        System.out.println("Duration: " + trafficLight.getDuration() + " seconds");

        trafficLight.changeColor("green");
        System.out.println("\nUpdated Traffic Light Status:");
        System.out.println("Color: " + trafficLight.getColor());
        System.out.println("Duration: " + trafficLight.getDuration() + " seconds");

        System.out.println("\nIs it red? " + trafficLight.isRed());
        System.out.println("Is it green? " + trafficLight.isGreen());

        trafficLight.setDuration(90);
        System.out.println("\nUpdated Traffic Light Status:");
        System.out.println("Color: " + trafficLight.getColor());
        System.out.println("Duration: " + trafficLight.getDuration() + " seconds");
    }
}
