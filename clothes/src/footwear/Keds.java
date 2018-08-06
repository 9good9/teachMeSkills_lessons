package footwear;

public class Keds implements IFootwear{
    /*private String material;
    private String color;
    private String size;

    public Keds(String material, String color, String size) {
        this.material = material;
        this.color = color;
        this.size = size;
    }

    public Keds() {

    }*/

    @Override
    public void putOn (){
        System.out.println("Надеты кеды");
    }

    @Override
    public void takeOff(){
        System.out.println("Кеды сняты");
    }
}
