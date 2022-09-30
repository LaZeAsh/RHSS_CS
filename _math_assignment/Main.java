package _math_assignment;
import hsa_ufa.*;
import java.awt.*;;
public class Main {
    static Console c;
    public static void main(String[] args) {
        c = new Console();
        hypotenuseCalculator(c);
    }   

    public static void volumeCalculator(Console c) {
        c.println("Input the height of your cube");
        int cubeHeight = c.readInt();
        c.println("Input the width of your cube");
        int cubeWidth = c.readInt();
        c.println("Input the length of your cube");
        int cubeLength = c.readInt();

        int cubeVolume = cubeHeight * cubeWidth * cubeLength;

        c.println("The volume of the cube is " + cubeVolume);
    }

    public static void hypotenuseCalculator(Console c) {
        c.println("Input the length of your triangle");
        int triangleLength = c.readInt();
        c.println("Input the width of your triangle");
        int triangleWidth = c.readInt();

        int hypotenuse = (int) Math.sqrt((triangleLength * triangleLength) + (triangleWidth * triangleWidth));

        c.println("The hypotenuse of your right triangle is " + hypotenuse);
    }

    public static void temperatureConverter(Console c) {
        c.println("Input your temperature in farenheit ");
        double farenheitTemp = c.readInt();
        double celsiusTemp = (farenheitTemp - 32) * 0.5556;

        c.println(farenheitTemp + " in celsius is " + celsiusTemp);
    }
}
