public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 5),
                new Cat("Murzik", 7),
                new Cat("Tom", 10),
                new Cat("Murka", 6),
                new Cat("Vaska", 11),
                new Cat("Lepold", 8),
                new Cat("Bagira", 9),
        };
        Plate plate = new Plate(50);
        plate.info();
        for (Cat cat : cats) {
            cat.eat(plate);
        }
        plate.info();
        plate.addFood(10);
        plate.info();
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " сытость: " + cat.isFull());
        }
    }

}
