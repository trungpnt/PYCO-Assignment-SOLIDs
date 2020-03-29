package HospitalStaff;

public class Nurse extends COVID19Fighter {

    public Nurse(String name, int id, boolean working) {
        super(name, id, working);
        System.out.println("HospitalStaff.Nurse is working");
    }
}
