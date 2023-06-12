public class Plate {
    private int food;
    
    public Plate(int food) {
        this.food = food;
    }
    
    public void decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
        }
    }
    
    public void addFood(int amount) {
        food += amount;
        System.out.println("Добавили в тарелку: " + amount + " еды.");
    }
    
    public int getFood() {
        return food;
    }
    
    public void info() {
        System.out.println("Сейчас в тарелке: " + food + " еды.");
    }
}
