package Lesson_1.Annotations;

import org.springframework.stereotype.Component;

@Component("Surgeon")
public class Surgeon implements Location {
    public void getCabinet (){
        System.out.println("Кабинет хирурга 403");
    }
}
