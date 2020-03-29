package Client;

import HospitalClients.HospitalManagement;
import HospitalStaff.COVID19Fighter;
import HospitalStaff.SecurityGuard;

public class EmergencyProcess {
    public static void main(String [] args){
        HospitalManagement someDirector = new HospitalManagement();

        COVID19Fighter security_1 = new SecurityGuard("Uncle Bob",1,true);
        someDirector.callUpon(security_1);

        COVID19Fighter security_2 = new SecurityGuard("Aunt Mary",2,true);
        someDirector.callUpon(security_2);


    }
}
