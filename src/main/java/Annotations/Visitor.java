package Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Visitor {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Reception reception = ctx.getBean(Reception.class);
        System.out.println("Annotations");
        reception.getDentist();

        reception.getSurgeon();

    }
}
