import java.util.Calendar;
import java.util.Scanner;

public class ProgramCar {
    public static void main(String[] args) {
        // числовые массивы
        int[] id = new int[9];
        int[] yearOfManufacture = {2006, 2005, 2000, 2012, 1970, 2008, 2007, 2003, 2015};
        int[] coast = {20000, 25000, 10000, 12000, 30000, 12500, 80000, 120000, 65000};

        // строковые массивы
        String[] color = {"Black", "Yellow", "Green", "Brown", "White"}; // цвет
        String[] brand = {"Toyota", "BMW", "Honda", "Volkswagen", "Ford", "Hyndai", "Audi", "Porshe", "Nissan"}; // марка
        String[] model = {"FJ Cruiser", "M5", "CR-V", "Pollo", "Mustang", "Sonata", "R8", "Carrera GT", "GTR"}; // модель
        String[] registrationNumber = {"BB3535CM", "NB4444NC", "SS350", "US7765LD", "R455R", "BQ12Q", "AA4455BB", "AB5433KS", "JJ2222AA"}; // рег. номер автомобиля

        Car[] cars = new Car[brand.length];

        for (int createCarIndex = 0; createCarIndex < brand.length; createCarIndex++) {
            Car car = new Car(createCarIndex,yearOfManufacture[createCarIndex],coast[createCarIndex],
                    color[randomNumbers()],brand[createCarIndex], model[createCarIndex], registrationNumber[createCarIndex]);
            cars[createCarIndex] = car;
        }
        chooseAction(cars);
    }

    private static void chooseAction (Car[] cars) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите действие :" + "\n" + "1. Вывести список автомобилей заданной марки." + "\n" +
                "2. Вывести список автомобилей заданной модели, которые эксплуатируются больше N лет." + "\n" +
                "3. Вывести список автомобилей заданного года выпуска, цена которых больше указанной." + "\n" +
                "4. Добавить новый автомобиль в список." + "\n" +
                "5. Выход.");
        int choose = 0;
        choose = in.nextInt();
        switch (choose) {
            case 1:{
                String inputBrand;
                System.out.println("Введите марку автомобиля");
                inputBrand = in.next();

                for (int i = 0; i < cars.length; i++){
                    if(cars[i].getBrand().equals(inputBrand)) {
                        System.out.println(cars[i].toString());
                    }
                }
                chooseAction(cars);
            }
            case 2: {
                String inputModel;
                int inPutYear;
                System.out.println("Введите модель автомобиля");
                inputModel = in.next();
                System.out.println("Введите не старше скольки лет должен быть автомобиль");
                inPutYear = in.nextInt();
                int counter = 0;

                for (int i = 0; i < cars.length; i++) {
                    if(cars[i].getModel().equals(inputModel)){
                        if ((getCurrentYear() - cars[i].getYearOfManufacture()) > inPutYear) {
                            System.out.println(cars[i].toString());
                            counter++;
                        }
                    }
                }
                if(counter == 0) {
                    System.out.println("Подходящей модели не найдено.");
                }

                chooseAction(cars);
            }
            case 3: {
                int inputYearOfManufacture;
                int inputCoast;
                System.out.println("Введите год выпуска автомобиля");
                inputYearOfManufacture = in.nextInt();
                System.out.println("Введите цену автомобиля");
                inputCoast = in.nextInt();
                int counter = 0;

                for (int i = 0; i < cars.length; i++) {
                    if(cars[i].getYearOfManufacture() == inputYearOfManufacture) {
                        if (cars[i].getCost() > inputCoast) {
                            System.out.println(cars[i].toString());
                            counter++;
                        }
                    }
                }
                if (counter == 0) {
                    System.out.println("Подходящей модели не найдено.");
                }

                chooseAction(cars);
            }
            case 4:{
                Car car = new Car();
                car.setId(cars.length + 1);
                System.out.println("Введите год выпуска автомобиля");
                int inputYearOfManufacture = in.nextInt();
                car.setYearOfManufacture(inputYearOfManufacture);
                System.out.println("Введите цену автомобиля");
                int inputCoast = in.nextInt();
                car.setCost(inputCoast);
                System.out.println("Введите цвет автомобиля");
                String inputColor = in.next();
                car.setColor(inputColor);
                System.out.println("Введите марку автомобиля");
                String inputBrand = in.next();
                car.setBrand(inputBrand);
                System.out.println("Введите модель автомобиля");
                String inputModel = in.next();
                car.setModel(inputModel);
                System.out.println("Введите регистрационный номер автомобиля");
                String inputRegistrationNumber = in.next();
                car.setRegistrationNumber(inputRegistrationNumber);

                cars = updateCars(cars, car);
                chooseAction(cars);
            }
            case 5: {
                break;
            }
        }

    }

    private static int randomNumbers() {
        int randomNum = (int) ( Math.random() * 5 );
        return  randomNum;
    }

    private static int getCurrentYear() {
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getDefault(), java.util.Locale.getDefault());
        calendar.setTime(new java.util.Date());
        return calendar.get(Calendar.YEAR);
    }

    private static Car[] updateCars(Car[] cars, Car car) {
        Car[] newCars = new Car[cars.length + 1];
        int index = 0;
        for(Car currentCar : cars){
            newCars[index] = currentCar;
            index++;
        }

        newCars[index] = car;
        return newCars;
    }
}
