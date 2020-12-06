package day7;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight){
        this.producer = producer;
        this.year = year;
        this.length = length;
        this. weight = weight;
        this.fuel = 0;
    }
    void info(){
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: "
                + length +", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    void fillUp(int inputFuel){
        fuel += inputFuel;
    }

    public String getProducer() {
        return producer;
    }

    public int getYear() {
        return year;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public static void compareAirplanes(Airplane air1, Airplane air2){
        if (air1.length < air2.length) {
            System.out.println("Второй самолет длиннее");
        } else if (air1.length > air2.length) {
            System.out.println("Первый самолет длиннее");
        } else {
            System.out.println("Длины самолетов равны");
        }
    }
}
