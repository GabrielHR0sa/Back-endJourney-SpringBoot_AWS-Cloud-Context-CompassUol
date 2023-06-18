package com.demo.rabbitmq;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class DirectPublisher {
    
    /*Definindo a Queue para qual a mensagem será encaminhada
     * No RabbitMq do browser, na Exchange foram criadas as queues
     * TV, Mobile, Ac
     * e nesse arquivo é definido a key que combina com a key definida na 
     * exchange 
     */
   public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.newConnection(); 
        Channel channel = connection.createChannel();
        
        String message = "This is Mobile";

        channel.basicPublish("Direct-Exchange", "mobile", null, message.getBytes());
    
        channel.close();
        connection.close();
    }

}
