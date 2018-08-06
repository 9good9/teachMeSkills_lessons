import footwear.AthleticShoe;
import footwear.Boots;
import footwear.IFootwear;
import footwear.Keds;
import jacket.BomberJacket;
import jacket.Coat;
import jacket.IJacket;
import jacket.LeatherJacket;
import pants.IPants;
import pants.Jeans;
import pants.Shorts;
import pants.Trousers;
import person.Person;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
       chooseAction(createPerson());
    }

    private static Person createPerson (){
        IJacket[] jackets = {new BomberJacket(), new LeatherJacket(), new Coat()};
        IPants[] pants = {new Jeans(), new Shorts(), new Trousers()};
        IFootwear[] footwears = {new Boots(), new Keds(), new AthleticShoe()};

        System.out.println("Введите имя человека :");
        Scanner in = new Scanner(System.in);
        Person person = new Person(in.next(), jackets[randomInt()], pants[randomInt()], footwears[randomInt()]);
        return person;
        //chooseAction(person);
    }

    private static void chooseAction (Person person){
        System.out.println("Выбирите тип операции :" + "\n" + "Одеться - 1" + "\n" + "Раздеться - 2" +
                "\n" +"Создать новую персону - 3" + "\n" + "Закончить - 4" + "\n");
        Scanner in = new Scanner(System.in);
        switch (in.nextInt()){
            case 1:
                System.out.println(person.getName() + ":");
                person.getDressed();
                System.out.print("\n");
                chooseAction(person);

            case 2:
                System.out.println(person.getName() + ":");
                person.unDressed();
                System.out.print("\n");
                chooseAction(person);
            case 3:
               chooseAction(createPerson());

            case 4:
                break;
        }


    }

    private static int randomInt (){
        return (int) (Math.random() * 3);
    }
}
