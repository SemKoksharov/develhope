package co.develhope.spring_rest_template.config;


import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    // Configurazione per ModelMapper
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper(); // Restituisce un'istanza di ModelMapper per la mappatura tra oggetti
    }
}


