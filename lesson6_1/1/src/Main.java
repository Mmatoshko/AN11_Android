public class Main {
    public static void main(String[] args) {
        Test testIvan = new Test();
        testIvan.body(new Patient(true,false,true, Patient.Vaccine.PFIZER));
    }
}