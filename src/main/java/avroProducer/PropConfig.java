package avroProducer;

import io.confluent.kafka.serializers.KafkaAvroSerializer;

import java.util.Properties;

/***
 * Properties configuration class
 */
public class PropConfig {
    /***
     * setting properties for consumer
     * @param props
     */
    public void setProperties(Properties props){
        // Set the brokers (bootstrap servers)
        props.setProperty("bootstrap.servers", "10.75.17.84:9092");

        // Set how to serialize key/value pairs
        props.setProperty("key.serializer","org.apache.kafka.common.serialization.StringSerializer");
        props.setProperty("value.serializer", KafkaAvroSerializer.class.getName());

        //the schema registry url
        props.setProperty("schema.registry.url","http://10.75.17.84:8081");

    }
}
