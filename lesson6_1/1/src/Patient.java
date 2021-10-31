public class Patient {
    boolean mask;
    boolean online;
    boolean recovered;
    Vaccine vaccineType;
    enum Vaccine {
        SPYTNIK ,
        SINOVAC ,
        PFIZER
    };

    public Patient(boolean mask, boolean online, boolean recovered, Vaccine vaccine){
        vaccineType = vaccine;
        this.mask = mask;
        this.online = online;
        this.recovered = recovered;
    }

    public boolean isMask() { return mask; }
    public boolean isOnline() { return online; }
    public boolean isRecovered() { return recovered; }
    public Vaccine getVaccine() { return vaccineType; }

}