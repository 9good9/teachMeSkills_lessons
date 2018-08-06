package pants;

public class Shorts implements IPants {
  /*  private String material;
    private String color;
    private String size;

    public Shorts(String material, String color, String size) {
        this.material = material;
        this.color = color;
        this.size = size;
    }

    public Shorts() {

    }*/

    @Override
    public void putOn (){
        System.out.println("Надеты шорты");
    }

    @Override
    public void takeOff(){
        System.out.println("Шорты сняты");
    }
}
