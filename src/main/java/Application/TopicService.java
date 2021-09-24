package Application;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class TopicService {

    private List<Topic> topics= new ArrayList<>(Arrays.asList(new Topic("1", "Spring", "Spring Framework Description"), new Topic("2", "Spring Boot", "Spring Boot Description")));
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
    public void addTopic(Topic topic)
    {
        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
        for (int i = 0; i < topics.size(); i++) {
            Topic t=topics.get(i);
            if(t.getId().equals(id))
            {
                topics.set(i,topic);
                return;
            }
        }
    }

    public void deleteTopic(String id) {
        for (int i = 0; i < topics.size(); i++) {
            if(topics.get(i).getId().equals(id))
            {
                topics.remove(i);
                return;
            }
        }
    }
}
