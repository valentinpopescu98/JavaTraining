package config;

import beans.Cat;
import beans.Owner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public Cat cat(){
        return new Cat("Regina");
    }

    @Bean
    public Owner owner(){
        Owner owner = new Owner("Patrocle");
        owner.setCat(cat());
        return owner;
    }
}
