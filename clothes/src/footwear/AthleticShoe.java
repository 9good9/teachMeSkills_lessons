package footwear;

public class AthleticShoe implements IFootwear {
    /*private String material;
    private String color;
    private String size;

    public AthleticShoe(String material, String color, String size) {
        this.material = material;
        this.color = color;
        this.size = size;
    }

    public AthleticShoe() {

    }*/

    @Override
    public void putOn (){
        System.out.println("Надеты кроссовки");
    }

    @Override
    public void takeOff(){
        System.out.println("Кроссовки сняты");
    }
}
