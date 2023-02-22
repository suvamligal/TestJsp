package com.kafkapublisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KafkaDemoPublisher1Application {
	
	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;
	
	private String topic ="quickstart-events";
	
	
	
	/*
	 * @GetMapping("/publishJson") public String publishMessage() {
	 * 
	 * //int 1, String Hamilton, String 1112223333, String jackhamilton@gmail.com,
	 * String Jackie22, String YoYo, String string6, String[] strings) Employee
	 * employee = new
	 * Employee(1,"Jack","Hamilton","1112223333","jackhamilton@gmail.com","Jackie22"
	 * ,"YoYo", new String[] {"Irving", "Texas"}); kafkaTemplate.send(topic,
	 * employee); return "Json Object sent"; }
	 */
	

	public static void main(String[] args) {
		SpringApplication.run(KafkaDemoPublisher1Application.class, args);
	}
	
	@GetMapping("/publish/{name}")
	public String publishMessage(@PathVariable String name) {
		kafkaTemplate.send(topic, "hi "+ name + " welcome");
		return "Message sent";
	}

}
