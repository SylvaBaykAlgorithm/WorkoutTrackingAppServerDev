package api.dev.WorkApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan("api.dev.Workapp")
public class WorkAppApplication{


	public static void main(String[] args) {
		SpringApplication.run(WorkAppApplication.class, args);
	}

}
