package uz.jtscorp.microservicechild1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("mc2")
public interface MicroService {
    @GetMapping
    String hello();

    @PostMapping("/message/{id}")
    MessageDTO message(@PathVariable Long id);
}
