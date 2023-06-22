package team04.kioskbe;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public String hello() {
        return "성공이다.~~~~~~~~~";
    }


    @GetMapping("/index")
    public String index() {
        return "성공";
    }
}
