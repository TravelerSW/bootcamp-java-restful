package me.dio;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootcampJavaRestfulApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(BootcampJavaRestfulApplication.class);
        //Adição do perfil "dev" para execução correta do código.
        app.setAdditionalProfiles("dev");
        app.run(args);    
    }
}


