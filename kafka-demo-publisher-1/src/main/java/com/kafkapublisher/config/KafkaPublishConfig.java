/*
 * package com.kafkapublisher.config;
 * 
 * import java.util.HashMap; import java.util.Map;
 * 
 * import org.apache.kafka.clients.producer.ProducerConfig; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.kafka.core.DefaultKafkaProducerFactory; import
 * org.springframework.kafka.core.KafkaTemplate; import
 * org.springframework.kafka.core.ProducerFactory;
 * 
 * import com.fasterxml.jackson.databind.JsonSerializer; import
 * com.fasterxml.jackson.databind.ser.std.StringSerializer; import
 * com.kafkapublisher.model.Employee;
 * 
 * @Configuration public class KafkaPublishConfig {
 * 
 * @Bean public ProducerFactory<String, Employee> producerFactory() {
 * Map<String, Object> config = new HashMap<>();
 * config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
 * config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
 * StringSerializer.class);
 * config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
 * JsonSerializer.class); return new DefaultKafkaProducerFactory<String,
 * Employee>(config);
 * 
 * }
 * 
 * @Bean public KafkaTemplate<String, Employee> kafkaTemplate() { return new
 * KafkaTemplate<>(producerFactory()); }
 * 
 * }
 */