package be.fai;

import java.util.Random;

public class Car {
    //Properties
    private String color = "White";
    private int currentSpeed = 0;
    private int maxSpeed = 120;
    private int horsePower = 150;
    static boolean lights = false;
    Driver driver = new Driver();
    private int counter;

    private String genPlateWithDriverName;
    private String genRandomPlate;


    private Random rand = new Random();
    private int randNumber = rand.nextInt(100, 1000);

    //Constructor non-arg
    public Car() {
        counter++;
    }

    //Constructor with 1 arg
    public Car(String color) {
        this.color = color;
        counter++;
    }

    //Constructor with 2 args
    public Car(String color, int maxSpeed) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        counter++;
    }

    //Constructor with 3 args
    public Car(String color, int maxSpeed, int horsePower) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.horsePower = horsePower;
        counter++;
    }

    //Constructor all-args
    public Car(String color, int currentSpeed, int maxSpeed, int horsePower, boolean lights) {
        this.color = color;
        this.currentSpeed = currentSpeed;
        this.maxSpeed = maxSpeed;
        this.horsePower = horsePower;
        this.lights = lights;
        counter++;
    }

    //Methods

    // SpeedUp method
    public void speedUp() {
        if (currentSpeed + 5 > maxSpeed) {

        } else {
            currentSpeed += 5;
        }
    }


    // SlowDown method
    public void slowDown() {
        if (currentSpeed - 5 < currentSpeed) {

        } else {
            currentSpeed -= 5;
        }
    }

    // Repaint method
    public void repaint(String color) {
        this.color = color;
    }

    // Reparing/bill methode

    public void cost() {
        int cost = rand.nextInt(100, 301);
        System.out.println("Rapair cost is " + cost + " $ !");
    }

    //Lights ( toggleLights ) methode
    public void LightsOnOf() {
        if (lights) {
            lights = !lights;
        } else {
            lights = true;
        }
    }

    // Generating plate number with the driver name
    public void generatePlateWithDriverName() {
        if (!(driver.getDriverName().toLowerCase().equals("unknown"))) {
            genPlateWithDriverName = driver.getDriverName().substring(0, 3).toUpperCase() + "-" + randNumber;
        } else {
            genPlateWithDriverName = "Not yet generated!";
        }
    }

    // Generating random plate number
    public void genRandomPlate() {
        String threeLetters = "";
        for (int i = 0; i < 3; i++) {
            char l1 = (char) (rand.nextInt(26) + 'a');
            threeLetters += l1;
        }
        genRandomPlate = threeLetters.toUpperCase() + "-" + randNumber;

    }

    // Method to print all details of the car
    @Override
    public String toString() {
        return "Color: " + this.color + " Max Speed: " + this.maxSpeed + " Horse Power: " + this.horsePower + " Current Speed: " + this.currentSpeed + " Driver name : " + driver.getDriverName() + " Lights are : " + lights + " plate number : " + genPlateWithDriverName + " randomplate " + genRandomPlate;
    }
}
