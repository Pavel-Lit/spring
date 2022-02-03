package Lesson_1.Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Reception")
public class Reception {

    private Location locationS, locationD;

    @Autowired
    @Qualifier("Dentist")
    public void setLocationD(Location location){
        this.locationD = location;
    }
    @Autowired
    @Qualifier("Surgeon")
    public void setLocationS(Location location){
        this.locationS = location;
    }

    public void getCabinetDentist(){
        locationD.getCabinet();
    }

    public void getCabinetSurgeon(){
        locationS.getCabinet();
    }


}
