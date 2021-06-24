package com.techprimers.kafka.springbootkafkaconsumerexample.listener;

import com.techprimers.kafka.springbootkafkaconsumerexample.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    //@Autowired zu H2
    @KafkaListener(topics = "Kafka_Example", group = "group_id")
    public void consume(String message) {
        //Statt message hier Posting
        System.out.println("Consumed message: " + message);

        //TODO RESTController in dem Frontend Daten abfragt
        //REPO.save
    }


    @KafkaListener(topics = "Kafka_Example_json", group = "group_json",
            containerFactory = "userKafkaListenerFactory")
    public void consumeJson(User user) {
        System.out.println("Consumed JSON Message: " + user);
    }
}
