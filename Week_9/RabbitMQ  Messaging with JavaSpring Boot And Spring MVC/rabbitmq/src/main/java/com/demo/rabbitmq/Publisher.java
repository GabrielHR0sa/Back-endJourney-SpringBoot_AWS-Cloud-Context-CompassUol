package com.demo.rabbitmq;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;


/*Envia a mensagem para o RabbitMq no browser 
 * No caso de 2 consumers, roda-los antes e depois 
 * enviar as mensagens
*/
public class Publisher {
    
    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.newConnection(); 
        Channel channel = connection.createChannel();

        //String message = "First message from RabbitMq";

        String[] messages = {"First", "Second", "Third", "Fourth"};

        for(String message:messages){
            channel.basicPublish("", "Queue-1", null, message.getBytes());
        }
        channel.close();
        connection.close();
    }

}
