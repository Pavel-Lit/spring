package Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Reception {

    @Autowired
    private Dentist dentist;
    @Autowired
    private Surgeon surgeon;


    public void getDentist() {
        System.out.println(dentist.getCabinet());
    }

    public void getSurgeon() {
        System.out.println(surgeon.getCabinet());
    }


}
