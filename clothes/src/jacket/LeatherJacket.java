package jacket;

public class LeatherJacket implements IJacket {
   /* private String material;
    private String color;
    private String size;

    public LeatherJacket(String material, String color, String size) {
        this.material = material;
        this.color = color;
        this.size = size;
    }

    public LeatherJacket() {

    }*/

    @Override
    public void putOn (){
        System.out.println("Надета кожаная куртка");
    }

    @Override
   public void takeOff(){
        System.out.println("Кожаная куртка снята");
    }
}
