public class Patient extends Person {
    int brithYear;
    Patient(String name , String id , int brithYear){
        super(name, id);
        this.brithYear = brithYear;
    }
    Patient(){

    }
    public int getBrithYear() {
        return brithYear;
    }
}
