public class Main {
    public static void main(String[] args) throws EvenNumberException {
        Car audi = new Car("Audi", 250, 5000);
        Car bmw = new Car("BMW", 280, 8000);
        Car opel = new Car("Opel", 210, 3000);
        audi.start();
        bmw.start();
        opel.start();
    }
}
