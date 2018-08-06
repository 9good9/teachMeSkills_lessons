package pants;

public class Jeans implements IPants{
   /* private String material;
    private String color;
    private String size;

    public Jeans(String material, String color, String size) {
        this.material = material;
        this.color = color;
        this.size = size;
    }

    public Jeans() {

    }*/

    @Override
    public void putOn (){
        System.out.println("Надеты джинсы");
    }

    @Override
    public void takeOff(){
        System.out.println("Джинсы сняты");
    }
}
