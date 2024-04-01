package com.patika.notificationservice.listener;

import com.patika.notificationservice.dto.NotificationDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public interface NotificationListener {

    @RabbitListener(queues = "${rabbitmq.queue}")
    void sendNotification(NotificationDTO notificationDTO);


}
