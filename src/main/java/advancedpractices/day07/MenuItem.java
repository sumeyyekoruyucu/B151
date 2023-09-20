package advancedpractices.day07;

public class MenuItem { //menu secenekleri
     //Yiyeceklerin Kodu,ismi ve ucreti olsun.

    private int code;
    private  String name;
    private double price;

    public MenuItem(int code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public MenuItem() { //default constructor
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
