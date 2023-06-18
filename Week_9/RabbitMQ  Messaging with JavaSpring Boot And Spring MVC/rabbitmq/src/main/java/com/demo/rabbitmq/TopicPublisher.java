package com.demo.rabbitmq;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class TopicPublisher {
    
    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.newConnection(); 
        Channel channel = connection.createChannel();

        String message = "Message for Mobile and Ac";

        /*
         * tv.mobile.ac um pedido para topic exchange
         * onde enviamos para todas as queues desde que possuam a key correta
         * no RabbitMq definimos as key para topic exchange
         * colocando por ex:
         * *.mobile*. onde mobile precisa conter 1 palavra antes e depois
         * também #.ac onde ac pode conter varias palavras antes, mas nenhuma depois
         */
        channel.basicPublish("Topic-Exchange", "tv.mobile.ac", null, message.getBytes());

        channel.close();
        connection.close();
    }

}
