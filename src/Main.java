public class Main {
    public static void main(String[] args) throws PersonNotFoundException {
        InfoSystem infoSystem = new InfoSystem();
        Patient patient = new Patient("Fatih" , "121312" , 2002);
        Doctor doctor = new Doctor("Emine" , "3432432" , 25);
        infoSystem.addDoctor(doctor);
        infoSystem.addPatient(patient);
        infoSystem.addTherapy(patient , doctor);
    }
}