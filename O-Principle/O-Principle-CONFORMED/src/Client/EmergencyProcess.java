package Client;

import HospitalClients.HospitalManagement;
import HospitalStaff.COVID19Fighter;
import HospitalStaff.SecurityGuard;

public class EmergencyProcess {
    public static void main(String [] args){
        HospitalManagement someDirector = new HospitalManagement();
        COVID19Fighter Bobby = new SecurityGuard("Uncle Bob",1,true);
        someDirector.callUpon(Bobby);

        COVID19Fighter Morgana = new SecurityGuard("Aunt Morgana",2,true);
        someDirector.callUpon(Morgana);
    }
}
