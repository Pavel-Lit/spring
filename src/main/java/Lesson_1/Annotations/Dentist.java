package Lesson_1.Annotations;

import org.springframework.stereotype.Component;

@Component("Dentist")
public class Dentist implements Location {


    public void getCabinet() {
        System.out.println("Кабинет стоматолога 212");
    }
}
