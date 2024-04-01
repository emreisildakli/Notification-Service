package com.patika.notificationservice.listener;

import com.patika.notificationservice.dto.NotificationDTO;
import com.patika.notificationservice.dto.enums.NotificationType;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmailNotificationListener implements NotificationListener {

    @Override
    public void sendNotification(NotificationDTO notificationDTO) {
        notificationDTO.setNotificationType(NotificationType.EMAIL);
        log.info("kuyruktan okudun: {}", notificationDTO);
    }
}
