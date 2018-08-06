public class Car {
    // числовые данные
    private int id; // id номер записи
    private int yearOfManufacture; // год выпуска автомобиля
    private double cost; // цена автомобиля
    // строковые данные
    private String color; // цвет
    private String brand; // марка
    private String model; // модель
    private String registrationNumber; // рег. номер автомобиля

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Car(){

    }

    public Car(int id, int yearOfManufacture, double cost, String color, String brand, String model, String registrationNumber){
        this.id = id;
        this.yearOfManufacture = yearOfManufacture;
        this.cost = cost;
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
    }
    @Override
    public String toString(){
        return " id-номер автомобиля - " + id +"; " +
                "\n марка автомобиля - " + brand + ";" +
                "\n модель автомобиля - " + model + ";" +
                "\n год выпуска автомобиля - " + yearOfManufacture + "; " +
                "\n цвет автомобиля - " + color + ";" +
                " \n цена автомобиля - " + cost + ";" +
                " \n регистрационный номер - " + registrationNumber + "; \n";
    }

}
