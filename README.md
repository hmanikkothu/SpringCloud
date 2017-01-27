# SpringCloud
Spring cloude sample &amp; demos

### 1. Rabbitmq
* Setup a rabbitmq server for the spring bus to use as an AMQP message broker.
 * You may use docker container for running rabbitmq for this purpose: docker run -d -p 5672:5672 -p 15672:15672 dockerfile/rabbitmq
* Update the application.yml of the config-server to point to the AMQP server

### 2. Run spring cloud services
Run the following servers using the commang "mvn spring-boot:run" 
* config-server	
* config-client	
* eureka-server	
* eurkclient-adjective	
* eurkclient-article	
* eurkclient-noun	
* eurkclient-sentence	
* eurkclient-subject	
* eurkclient-verb	
* spring-gateway

### Verify the services
* Navigate to the Eureka server "http://localhost:8010/". Verify that it is able to display the status of all the microservices got registered with it.
* Verify all the 'eurkclient' services; you may use the links displayed in Eureka server home page (under the status).
* Navigate to the config-server @ http://localhost:8001/config-client/northamerica to make sure that it is able to get the config file for the northamerica profile that is currently the active profile
* Navigate to the config-client @ http://localhost:8002/word-of-the-day to make sure that is able to get the config through the spring bus
* Navigate to the eurkclient-sentence @ http://localhost:8020/sentence to make sure that it is able to resolve and access all service end points through the Eureka server
* Navigate to the spring-gateway test page @ http://localhost:8090/sentence, verify that it is able to access all services though the Zuul gateway
