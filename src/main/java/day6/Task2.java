package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane air1 = new Airplane("Cessna", 1978, 5, 1700);
        air1.setYear(1999);
        air1.setLength(6);
        air1.fillUp(5);
        air1.fillUp(10);
        air1.info();


    }
}
