package uz.jtscorp.microservicechild2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Microservice2Controller {

    private final RestTemplate restTemplate;

    public Microservice2Controller(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello from Microservice 2");
    }

    @PostMapping("/message/{id}")
    public ResponseEntity<MessageDTO> getMessage(@PathVariable Long id) {
        MessageDTO messageDTO =new MessageDTO();
        messageDTO.setId(id);
        messageDTO.setBody("Hello from Microservice 2");
        return ResponseEntity.ok(messageDTO);
    }
}
