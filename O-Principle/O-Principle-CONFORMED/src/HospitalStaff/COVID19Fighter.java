package HospitalStaff;

abstract public class COVID19Fighter {
    private String name;
    private int id;
    private boolean working;

    public COVID19Fighter(String name, int id, boolean working) {
        this.name = name;
        this.id = id;
        this.working = working;
    }

    public void doDuties(){}

}
