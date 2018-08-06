package jacket;

public class Coat implements IJacket {
    /*private String material;
    private String color;
    private String size;

    public Coat(String material, String color, String size) {
        this.material = material;
        this.color = color;
        this.size = size;
    }

    public Coat() {

    }*/

    @Override
    public void putOn (){
        System.out.println("Надето пальто");
    }

    @Override
    public void takeOff(){
        System.out.println("Пальто снято");
    }
}
