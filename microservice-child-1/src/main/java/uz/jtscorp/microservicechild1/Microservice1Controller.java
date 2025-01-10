package uz.jtscorp.microservicechild1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@RestController
public class Microservice1Controller {

   /* private final MicroServiceImpl microService;

    public Microservice1Controller( MicroServiceImpl microService) {
        this.microService = microService;
    }*/

    private final MicroService microService;

    public Microservice1Controller(MicroService microService) {
        this.microService = microService;
    }

    @GetMapping
    public ResponseEntity<String> hello() {
        try {
            String response = microService.hello();
            return ResponseEntity.ok("Hello from Microservice 1: " + response);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Fallback: mc2 is unavailable.");
        }
    }

    @GetMapping("/message")
    public ResponseEntity<MessageDTO> message(Long id) {
        MessageDTO messageDTO = microService.message(id);
        messageDTO.setCreatedDate(new Date().getTime());
       return ResponseEntity.ok(messageDTO);
    }

}
