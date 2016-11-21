
/**
 * Created by Austin on 11/21/16.
 */

public class DrivingDecision {

    public enum TrafficLightColors {
        RED, YELLOW, GREEN
    }

    public static void main(String[] args) {
        TrafficLightColors lightColors = TrafficLightColors.YELLOW;
        makeDrivingDecision(lightColors);

    }

    public static void makeDrivingDecision(TrafficLightColors lightColor) {
        switch(lightColor) {
            case RED:
                System.out.println("Red means STOP!");
                break;
            case YELLOW:
                System.out.println("Yellow, Step on the Gas!");
                break;
            case GREEN:
                System.out.println("Green says keep going!");
        }
    }

}