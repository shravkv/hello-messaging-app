package dto;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloMessagingAppController {

    @GetMapping("/getdata")
    public String hello() {
        return "Hello Bridgelabz!";
    }

    @GetMapping("/query")
    public String querryParam(@RequestParam String name){
        return "Hello" + " " + name + " " + "from Bridgelabz";
    }

    @GetMapping("/path/{name}")
    public String nameParam(@PathVariable String name) {
        return "Hello" + " " + name + " " + "!";
    }

}