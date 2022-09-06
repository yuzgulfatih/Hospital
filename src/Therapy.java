public class Therapy {
    Doctor doctor = new Doctor();
    Patient patient = new Patient();
    String details;
    public Therapy(Doctor doctor , Patient patient){
        this.doctor = doctor;
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
