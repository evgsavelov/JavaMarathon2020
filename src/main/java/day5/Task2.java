package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike moto1 = new Motorbike(2018, "Red", "Sherco");
        System.out.println(moto1.getProductionYear() + " " + moto1.getColor() + " " + moto1.getModel());
    }
}

class Motorbike {
    private int productionYear;
    private String color;
    private String model;

    public Motorbike(int productionYear, String color, String model){
        this.productionYear = productionYear;
        this.color = color;
        this.model = model;
    }
    public int getProductionYear(){
        return productionYear;
    }
    public String getColor(){
        return  color;
    }
    public  String getModel(){
        return model;
    }
}
