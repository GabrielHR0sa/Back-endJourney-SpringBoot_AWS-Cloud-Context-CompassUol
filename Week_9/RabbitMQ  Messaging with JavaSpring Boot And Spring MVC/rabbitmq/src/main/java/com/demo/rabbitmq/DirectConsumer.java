package com.demo.rabbitmq;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;


/*Recebe a mensagem do RabbitMq no browser
 * Aqui recebemos apenas a mensagem referente a queue definida em
 * channel.basicConsume("Mobile"...
 * o primeiro campo define a queue, e o publisher enviou a mensagem 
 * para essa queue atravez da definição da key 
 */
public class DirectConsumer {
    
    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.newConnection(); 
        Channel channel = connection.createChannel();

        DeliverCallback deliverCallBack = (consumerTag, delivery) -> {
            String message = new String(delivery.getBody());
            System.out.println("Message received = " + message);
        };
        channel.basicConsume("Mobile", true, deliverCallBack, consumerTag ->{});
    }

}
