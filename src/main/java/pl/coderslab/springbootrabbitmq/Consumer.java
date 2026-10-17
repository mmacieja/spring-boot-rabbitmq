package pl.coderslab.springbootrabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @RabbitListener(queues = RabbitConfig.QUEUE_NAME)
    public void receive(String message) {
        System.out.println("Received: " + message);
    }
}