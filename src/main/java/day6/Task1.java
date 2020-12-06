package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.info();
        System.out.println(car1.yearDifference(5));

        Motorbike moto1 = new Motorbike(2021, "red", "sherco" );
        moto1.info();
        System.out.println(moto1.yearDifference(10));
    }
}
