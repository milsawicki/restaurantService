import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;

@Configuration
@SpringBootApplication(scanBasePackages = {"Package"})
@EntityScan(basePackages = {"Package.Entities"})
@EnableJpaRepositories(basePackages = "Package.Repositories")

public class RestaurantMain {
    public static void main(String[] args) {
        SpringApplication.run(RestaurantMain.class, args);
    }
}
