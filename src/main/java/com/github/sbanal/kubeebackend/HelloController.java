package com.github.sbanal.kubeebackend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class HelloController {

    private static Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @PostMapping("/hello")
    public ResponseEntity<HelloResponse> hello(@RequestBody HelloRequest request) {
        HelloResponse response = new HelloResponse();
        response.setMessage("Hello " + request.getName());
        LOGGER.info("Received name: " + request.getName());
        return ResponseEntity.ok(response);
    }

}
