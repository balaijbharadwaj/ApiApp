package Application;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TopicService {

    private List<Topic> topics= List.of(new Topic("1", "Spring", "Spring Framework Description"), new Topic("2", "Spring Boot", "Spring Boot Description"));
    public List<Topic> getAllTopics()
    {
        return topics;
    }


    public Topic getTopic(String id)
    {
        for(Topic t:topics)
        {
            if(t.getId().equals(id))
                return t;

        }
        return new Topic();
    }

}
