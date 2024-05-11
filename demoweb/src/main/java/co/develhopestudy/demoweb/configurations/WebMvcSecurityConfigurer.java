package co.develhopestudy.demoweb.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//-------------------------------------ES 4 ----------------------------------------------------------------------------
@Configuration
public class WebMvcSecurityConfigurer implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // HO IMPOSTATO ACESSO SOLO DA PORTA 80 PER TUTTI I METODI
        //PER metodo invertName c`e acesso solo da porta 3346(impostato per esempio, e ho controllato che dalla porta 3346 funziona)
        //  (GUARDARE NameController)
        //     @PostMapping("/invert/{name}")
        //    @CrossOrigin(origins = "http://localhost:3346" )
        //    public String invert(@PathVariable String name) {
        //       return nameService.invertName(name);
        //    }

        // ????????????? DOMANDA: ho controllato da app che gira sulla porta 3446,
        // ma postman ha acesso lo stesso , acnhe se cambio header "Host" `e normale?
        registry.addMapping("/**").allowedOrigins("http://localhost:80");

    }

}



//-------------------------------------ES 4 END----------------------------------------------------------------------------