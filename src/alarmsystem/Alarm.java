
package alarmsystem;


public class Alarm {
    public boolean isAlarmStatusWarning(double suhuYangTerdeteksi, boolean statusSensorAsap, boolean statusSensorWaterDetection) {
        boolean statusAlarmWarning = false;
        
        if(suhuYangTerdeteksi > 55.5 || statusSensorAsap == true || statusSensorWaterDetection == true) {
            statusAlarmWarning = true;
        }
    
        return statusAlarmWarning;
    }
    
}
