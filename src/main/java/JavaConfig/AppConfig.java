package JavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan

public class AppConfig {
        @Bean(name = "dentist")
    public Location locationDentist(){
            return new Dentist();
        }

        @Bean(name = "surgeon")
    public Location locationSurgeon() {
            return new Surgeon();
        }

        @Bean(name = "ReceptionS")
    public Reception getCabinetSurgeon(Location surgeon){
            Reception reception = new Reception();
            reception.setLocation(surgeon);
            return reception;
        }
    @Bean(name = "ReceptionD")
    public Reception getCabinetDentist(Location dentist){
        Reception reception = new Reception();
        reception.setLocation(dentist);
        return reception;
    }
}
