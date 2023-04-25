package sa.project.css;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CssApplication {

	public static void main(String[] args) {
		SpringApplication.run(CssApplication.class, args);
	}

}
