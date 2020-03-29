package HospitalStaff;

public class SecurityGuard extends COVID19Fighter {

    public SecurityGuard(String name, int id, boolean working) {
        super(name, id, working);
        System.out.println("Guard is working");
    }
    private void coordinateVehicle(){
        System.out.println("Coordinating...");
    }
    private void takeBodyTemperature(){
        System.out.println("taking...");
    }

    @Override
    public void doDuties() {
        coordinateVehicle();
        takeBodyTemperature();
    }
}
