package HospitalStaff;

public class SecurityGuard extends COVID19Fighter {

    public SecurityGuard(String name, int id, boolean working) {
        super(name, id, working);
        System.out.println("Guard is working");
    }
}
