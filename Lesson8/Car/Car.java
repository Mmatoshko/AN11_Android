public class Car {
    private String name;
    private int speed;
    private int price;

    public Car(String name, int speed, int price) {
        this.name = name;
        this.speed = speed;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void start() throws EvenNumberException {
        double doubleRandom = Math.random() * 20;
        int intRandom = (int) doubleRandom;
        try {
            if (intRandom % 2 == 0) {
                throw new EvenNumberException(name);
            } else {
                System.out.println("Car " + name + " started successfully");
            }
        } catch (EvenNumberException e) {
            e.printStackTrace();
        }
    }
}
