package me.dio;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootcampJavaRestfulApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(BootcampJavaRestfulApplication.class);
        app.run(args);    
    }
}


