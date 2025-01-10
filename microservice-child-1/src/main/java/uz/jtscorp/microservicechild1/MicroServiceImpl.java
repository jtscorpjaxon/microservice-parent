package uz.jtscorp.microservicechild1;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

//@Service
public class MicroServiceImpl/* implements MicroService */{
   /* private final RestTemplate restTemplate;

    public MicroServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public String hello() {
        return "Hello from Microservice 1: " + restTemplate.getForObject("http://mc2", String.class);
    }

    @Override
    public MessageDTO message(Long id) {
        MessageFrom2DTO response = restTemplate.postForObject("http://mc2/message/" + id, null,MessageFrom2DTO.class);
        if (response == null) {
            return null;
        }
        return new MessageDTO(id, response.getBody(), new Date().getTime());
    }*/
}
