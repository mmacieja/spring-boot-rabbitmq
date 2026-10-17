package pl.coderslab.springbootrabbitmq;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootRabbitmqApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRabbitmqApplication.class, args);
    }

    @Bean
    CommandLineRunner sendMessage(Producer producer) {
        return args -> producer.send("Hello RabbitMQ!");
    }

}
