package ie.atu.oopsem2lab7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OopSem2Lab7Application {

	public static void main(String[] args) {
		SpringApplication.run(OopSem2Lab7Application.class, args);
	}
}