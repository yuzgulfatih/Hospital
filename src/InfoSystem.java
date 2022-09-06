import java.util.ArrayList;
import java.util.List;

public class InfoSystem {
    static List<Doctor> doctors = new ArrayList<>();
    static List<Patient> patients = new ArrayList<Patient>();
    boolean isPatient;
    boolean isDoctor;
    boolean isTherapy;

    boolean addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Added patient ID number " + patient.id);
        return true;
    }

    Patient findPatient(String id) throws PersonNotFoundException {
        isPatient = false;
        for (int i = 0; i < patients.size(); i++) {
            if (id == patients.get(i).id) {
                isPatient = true;
            }
            if (isPatient) {
                System.out.println("There is a patient with ID number  " + id);
            } else {
                throw new PersonNotFoundException("No patient with ID number " + id);
            }
        }
        return null;
    }

    boolean addDoctor(Doctor doctor) {
        doctors.add(doctor);
        System.out.println("Added doctor ID number " + doctor.id);
        return true;
    }

    Doctor findDoctor(String id) throws PersonNotFoundException {
        isDoctor = false;
        for (int j = 0; j < doctors.size(); j++) {
            if (id == doctors.get(j).id) {
                isDoctor = true;
            }
            if (isDoctor) {
                System.out.println("There is a doctor with ID number  " + id);
            } else {
                throw new PersonNotFoundException("No doctor with ID number " + id);
            }
        }
        return null;
    }

    Therapy addTherapy(Patient patient , Doctor doctor) throws PersonNotFoundException{
        isTherapy = false;
        for (int k = 0; k < patients.size(); k++) {
            for (int l = 0; l < doctors.size(); l++) {
                if (patient == patients.get(k) && doctor == doctors.get(l)){
                    isTherapy = true;
                }
            }
        }

        if (isTherapy){
            System.out.println("Therapy created");
        }else {
            throw new PersonNotFoundException("Therapy not created");
        }
        return null;
    }
}
