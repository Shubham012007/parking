package online.parking.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ss {

    @GetMapping("/")
    public String home() {
        return "login";
    }
}