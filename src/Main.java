public class Main {
    public static void main(String[] args) {
        InfoSystem infoSystem = new InfoSystem();
        Patient patient = new Patient("Fatih" , "121312" , 2002);
        infoSystem.addPatient(patient);
    }
}