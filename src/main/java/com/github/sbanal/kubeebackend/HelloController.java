package com.github.sbanal.kubeebackend;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class HelloController {

    @PostMapping("/hello")
    public ResponseEntity<HelloResponse> hello(@RequestBody HelloRequest request) {
        HelloResponse response = new HelloResponse();
        response.setMessage("Hello " + request.getName());
        return ResponseEntity.ok(response);
    }

}
