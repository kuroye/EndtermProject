public abstract class Computer {
    private int id;
    private int price;
    private String brand;
    private double screenSize;

    public Computer() {
        this.id = 0;
        this.price = 400000;
        this.brand = "Apple";
        this.screenSize = 20.0;
    }

    public Computer(int id,int price, String brand, double screenSize) {
        this.id = id;
        this.price = price;
        this.brand = brand;
        this.screenSize = screenSize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id=" + id +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", screenSize=" + screenSize ;
    }
}