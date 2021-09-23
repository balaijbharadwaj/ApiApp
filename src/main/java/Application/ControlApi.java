package Application;

import Application.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ControlApi {
    @RequestMapping("/hi")
    public String sayHi()
    {
        return "Hi";
    }

    @RequestMapping("/topics")
    public List<Topic> getAllTopics()
    {
//        System.out.println("Hello");
        return List.of(new Topic("1", "Spring", "Spring Framework Description"), new Topic("2", "Spring Boot", "Spring Boot Description"));
    }
}
