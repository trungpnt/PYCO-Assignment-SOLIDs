package HospitalStaff;

public class Nurse extends COVID19Fighter {

    public Nurse(String name, int id, boolean working) {
        super(name, id, working);
        System.out.println("HospitalStaff.Nurse is working");
    }
    private void checkVitalSigns(){
        System.out.println("Checking...");
    }
    private void drawBlood(){
        System.out.println("drawing Blood");
    }
    private void cleanPatientArea(){
        System.out.println("Cleaning....");
    }

    @Override
    public void doDuties() {
        checkVitalSigns();
        drawBlood();
        cleanPatientArea();
    }
}
