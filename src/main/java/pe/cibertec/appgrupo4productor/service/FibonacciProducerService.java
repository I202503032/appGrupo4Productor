package pe.cibertec.appgrupo4productor.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class FibonacciProducerService {

    private final RabbitTemplate rabbitTemplate;

    public FibonacciProducerService(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void send(String numbers) {

        rabbitTemplate.convertAndSend(
                "Grupo4Exchange",
                "Grupo4Routing",
                numbers
        );
    }
}