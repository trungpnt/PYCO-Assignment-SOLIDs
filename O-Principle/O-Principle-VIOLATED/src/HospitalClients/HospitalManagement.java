package HospitalClients;

import HospitalStaff.COVID19Fighter;
import HospitalStaff.Nurse;
import HospitalStaff.SecurityGuard;

public class HospitalManagement {

    //This class is forced to contain all kinds of behaviors which should belong to the
    //HospitalStaff.COVID19Fighter class, and each fighter's behavior should only be carried out by each
    //fighter objects
    public void callUpon(COVID19Fighter covid19Fighter){
        //If this class is required to support the work done by the CEO or another department
        //These conditionals with "instance of" will be messy
        if(covid19Fighter instanceof Nurse){
            checkVitalSigns();
            drawBlood();
            cleanPatientArea();
        }
        if(covid19Fighter instanceof SecurityGuard){
            coordinateVehicle();
            takeBodyTemperature();
        }
    }
    //This class also knows too much about what nurses and guards are doing, and in the future
    //it will know all duties of many other employees in the hospital
    //So it violates OCP principle

    //HospitalStaff.Nurse
    private void checkVitalSigns(){
        System.out.println("Checking...");
    }
    private void drawBlood(){
        System.out.println("drawing Blood");
    }
    private void cleanPatientArea(){
        System.out.println("Cleaning....");
    }
    //Guard
    private void coordinateVehicle(){
        System.out.println("Coordinating...");
    }
    private void takeBodyTemperature(){
        System.out.println("taking...");
    }
}
