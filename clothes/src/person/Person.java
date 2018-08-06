package person;

import footwear.IFootwear;
import jacket.IJacket;
import pants.IPants;

public class Person implements IPerson{
    private String name;
    private IJacket jacket;
    private IPants pants;
    private IFootwear footwear;

    public Person(String name, IJacket jacket, IPants pants, IFootwear footwear) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.footwear = footwear;
    }

    public Person(){

    }

    public String getName() {
        return name;
    }

    @Override
    public void getDressed(){
        jacket.putOn();
        pants.putOn();
        footwear.putOn();
    }

    @Override
    public void unDressed(){
        jacket.takeOff();
        pants.takeOff();
        footwear.takeOff();
    }

}
