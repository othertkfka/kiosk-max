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

    @GetMapping("/hello")
    public String hello2() {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "</head>\n" +
                "<body>\n" +
                "Hello World\n" +
                "</body>\n" +
                "</html>\n";
    }
}
