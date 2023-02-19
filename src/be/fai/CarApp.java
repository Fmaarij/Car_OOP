package be.fai;

public class CarApp {
    public static void main(String[] args) {

        Car audi = new Car();
        System.out.println(audi);

        audi.driver.setDriverName("James");
        System.out.println(audi);

        Car vw = new Car("Green");
        System.out.println(vw);
        vw.LightsOnOf();
        vw.driver.setDriverName("Lidda");
        vw.generatePlateWithDriverName();
        vw.genRandomPlate();
        System.out.println(vw);



    }
}
