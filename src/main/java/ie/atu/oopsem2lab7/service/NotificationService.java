package ie.atu.oopsem2lab7.service;

import ie.atu.oopsem2lab7.clients.ReservationClient;
import ie.atu.oopsem2lab7.model.NotificationRecord;
import ie.atu.oopsem2lab7.repository.NotificationRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;
    private final ReservationClient reservationClient;

    public NotificationService(NotificationRepository notificationRepository, ReservationClient reservationClient) {
        this.notificationRepository = notificationRepository;
        this.reservationClient = reservationClient;
    }

    public NotificationRecord createNotification(Long reservationId) {
        ReservationClient.ReservationResponse reservation = reservationClient.getReservationById(reservationId);

        NotificationRecord record = new NotificationRecord();
        record.setReservationId(reservation.getLoanId());
        record.setStudentEmail(reservation.getEmail());
        record.setEquipmentTag(reservation.getLoanTag());
        record.setNotificationDate(LocalDate.now());
        record.setNotificationSent(true);

        return notificationRepository.save(record);
    }

    public List<NotificationRecord> getAllNotifications() {
        return notificationRepository.findAll();
    }
}