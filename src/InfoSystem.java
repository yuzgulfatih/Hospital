import java.util.ArrayList;
import java.util.List;

public class InfoSystem {
    static List<Doctor> doctors = new ArrayList<>();
    static List<Patient> patients = new ArrayList<>();
    boolean isTrue;
    boolean isDoctor;
    boolean isTherapy;

    boolean addPatient(Patient patient){
        patients.add(patient);
        System.out.println("Added patient ID number " + patient.id);
        return true;
    }
}
