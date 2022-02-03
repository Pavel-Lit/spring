package Annotations;

import org.springframework.stereotype.Component;

@Component
public class Surgeon  {
    public String getCabinet (){
        return  "Кабинет хирурга 403";
    }
}
