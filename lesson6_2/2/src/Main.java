public class Main {
    public static void main(String[] args) {
        Greeter englishGreeter = new Greeter() {
            @Override
            public void wish() {
                System.out.println("Hello");
            }
        };
        Greeter spanishGreeter = new Greeter() {
            @Override
            public void wish() {
                System.out.println("¡Hola!");
                
            }
        };
        Greeter germanGreeter = new Greeter() {
            @Override
            public void wish() {
                System.out.println("Guten Tag!");
            }
        };



        englishGreeter.wish();
        spanishGreeter.wish();
        germanGreeter.wish();
    }
}
