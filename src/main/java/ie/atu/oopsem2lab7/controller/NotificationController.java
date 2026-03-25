package ie.atu.oopsem2lab7.controller;

import ie.atu.oopsem2lab7.model.NotificationRecord;
import ie.atu.oopsem2lab7.service.NotificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping("/{reservationId}")
    public ResponseEntity<NotificationRecord> createNotification(@PathVariable Long reservationId) {
        return ResponseEntity.ok(notificationService.createNotification(reservationId));
    }

    @GetMapping
    public ResponseEntity<List<NotificationRecord>> getAllNotifications() {
        return ResponseEntity.ok(notificationService.getAllNotifications());
    }
}