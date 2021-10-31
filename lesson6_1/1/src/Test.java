public class Test {

    public Test() {}

    public boolean firstTest(Patient patient) {
        double chance = 50;
        if ( patient.isMask() ) chance -= 10; else chance += 10;
        if ( patient.isOnline() ) chance -= 30; else chance += 30;
        if ( patient.isRecovered() ) chance -= 40; else chance += 40;
        if ( patient.getVaccine() == Patient.Vaccine.SPYTNIK || patient.getVaccine() == Patient.Vaccine.SINOVAC
                || patient.getVaccine() == Patient.Vaccine.PFIZER)
            chance -= 40;
        else chance += 40;
        return !(chance < 50);
    }
    public int secondTest(Patient patient) {
        int amount = 0;
        if( patient.isRecovered() ) amount += 50;
        if(  patient.getVaccine() == Patient.Vaccine.SPYTNIK || patient.getVaccine() == Patient.Vaccine.SINOVAC
                || patient.getVaccine() == Patient.Vaccine.PFIZER) {
            amount += 40;
        }
        return amount;
    }
    public void info(Patient patient) {
        System.out.println("Mask : " + patient.isMask() +
                "\nOnline : " + patient.isOnline() +
                "\nRecovered : " + patient.isRecovered());
        if ( patient.getVaccine() == Patient.Vaccine.SPYTNIK || patient.getVaccine() == Patient.Vaccine.SINOVAC
                || patient.getVaccine() == Patient.Vaccine.PFIZER)
            System.out.println("The patient vaccinated with " + patient.getVaccine() + " vaccine!!!");
        else System.out.println("The patient is not vaccinated...");
    }
    public void body(Patient patient){
        info(patient);
        if( firstTest(patient) ) System.out.println("The patient is sick..."); else System.out.println("The patient is not sick!!!");
        System.out.println("Amount of antibodies : " + secondTest(patient) + "%");
    }
}