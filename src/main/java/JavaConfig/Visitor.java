package JavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Visitor {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

            Reception r1 = ctx.getBean("ReceptionD", Reception.class);
            Reception r2 = ctx.getBean("ReceptionS", Reception.class);
        System.out.println("JavaConfig");
            r1.getCabinet();
            r2.getCabinet();



    }
}
