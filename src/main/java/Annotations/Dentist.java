package Annotations;

import org.springframework.stereotype.Component;

@Component
public class Dentist {


    public String getCabinet() {
        return "Кабинет стоматолога 212";
    }
}
