package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane air1 = new Airplane("Cessna", 1978, 5, 1700);
        Airplane air2 = new Airplane("Airbus", 1978, 523, 56200);

        Airplane.compareAirplanes(air1, air2);


    }
}