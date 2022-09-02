package dto;

import org.springframework.web.bind.annotation.*;
import com.bridgelabz.hellomessagingapp.controller.dto.User;

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

    @PostMapping("/adduser")
    public String addUser(@RequestBody User user) {
        return "Hello" + user.getFirstName() + " " + user.getLastName() +"!";
    }

    @PostMapping("/post")
    public String addUserRequestParam(@RequestParam String firstName, @RequestParam String lastName) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return user.toString();
    }

}