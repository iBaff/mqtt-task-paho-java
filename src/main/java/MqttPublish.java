import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

public class MqttPublish {

    public static void main(String[] args) {

        String topic        = "API_usability/Paho/counting";
        int qos             = 2;
        String broker       = "tcp://test.mosquitto.org:1883";
        String clientId     = "JavaSample";
        MemoryPersistence persistence = new MemoryPersistence();

        /* Put code here */
        System.out.println("Put Code please.");
    }
}