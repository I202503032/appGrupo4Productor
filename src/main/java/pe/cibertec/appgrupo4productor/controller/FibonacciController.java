package pe.cibertec.appgrupo4productor.controller;

import pe.cibertec.appgrupo4productor.service.FibonacciProducerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/fibonacci")
public class FibonacciController {

    private final FibonacciProducerService producerService;

    public FibonacciController(FibonacciProducerService producerService) {
        this.producerService = producerService;
    }

    @GetMapping("/send")
    public String send(@RequestParam String numbers) {

        producerService.send(numbers);

        return "Lista enviada a RabbitMQ correctamente";
    }
}