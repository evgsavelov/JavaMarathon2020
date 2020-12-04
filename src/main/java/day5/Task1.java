package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setProductionYear(2021);
        car1.setColor("Ocean");
        car1.setModel("Taycan");
        System.out.println(car1.getProductionYear() + " " + car1.getColor() + " " + car1.getModel());
    }
}

class Car {
    private int productionYear;
    private String color;
    private String model;

    public void setProductionYear(int currentProductionYear){
        productionYear = currentProductionYear;
    }
    public int getProductionYear(){
        return productionYear;
    }

    public void setColor(String currentColor){
        color = currentColor;
    }
    public String getColor(){
        return color;
    }

    public void setModel(String currentModel){
        model = currentModel;
    }
    public String getModel(){
        return model;
    }

}
