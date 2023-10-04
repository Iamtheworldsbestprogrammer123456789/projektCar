import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(65234, "volvo", "benim",1000000);
        car1.setOwner("Carl");
        System.out.println(car1.getOwner());
        car1.speedUp(210);

    }

}