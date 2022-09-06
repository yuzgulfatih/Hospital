public class Doctor extends Person {
    int diplomaNo;
    Doctor(String name , String id , int diplomaNo ){
        super(name, id);
        this.diplomaNo = diplomaNo;
    }

    public int getDiplomaNo() {
        return diplomaNo;
    }
}
