package pants;

public class Trousers implements IPants{
   /* private String material;
    private String color;
    private String size;

    public Trousers(String material, String color, String size) {
        this.material = material;
        this.color = color;
        this.size = size;
    }

    public Trousers() {

    }*/

    @Override
    public void putOn (){
        System.out.println("Надеты брюки");
    }

    @Override
    public void takeOff(){
        System.out.println("Брюки сняты");
    }
}
