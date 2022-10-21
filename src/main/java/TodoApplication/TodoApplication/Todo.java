package TodoApplication.TodoApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Todo {

    @GetMapping("/")
    public String helloWorld() {
        System.out.println("tlqkf!!");
        return "To-do Application !";
    }
}