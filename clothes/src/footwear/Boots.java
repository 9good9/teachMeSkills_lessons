package footwear;

public class Boots implements IFootwear {
   /* private String material;
    private String color;
    private String size;

    public Boots(String material, String color, String size) {
        this.material = material;
        this.color = color;
        this.size = size;
    }

    public Boots() {

    }*/

    @Override
    public void putOn (){
        System.out.println("Надеты ботинки");
    }

    @Override
    public void takeOff(){
        System.out.println("Ботинки сняты");
    }
}
