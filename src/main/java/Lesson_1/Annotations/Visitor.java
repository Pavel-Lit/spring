package Lesson_1.Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Visitor {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext("Lesson_1.Annotations");
        Reception reception = ctx.getBean(Reception.class);
        System.out.println("Lesson_1/Annotations");
        reception.getCabinetDentist();

        reception.getCabinetSurgeon();

    }
}
