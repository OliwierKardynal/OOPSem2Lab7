package ie.atu.oopsem2lab7.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class NotificationRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long reservationId;
    private String studentEmail;
    private Long equipmentTag;
    private LocalDate notificationDate;
    private Boolean notificationSent;

    public NotificationRecord() {
    }

    public NotificationRecord(Long id, Long reservationId, String studentEmail, Long equipmentTag, LocalDate notificationDate, Boolean notificationSent) {
        this.id = id;
        this.reservationId = reservationId;
        this.studentEmail = studentEmail;
        this.equipmentTag = equipmentTag;
        this.notificationDate = notificationDate;
        this.notificationSent = notificationSent;
    }

    public Long getId() {
        return id;
    }

    public Long getReservationId() {
        return reservationId;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public Long getEquipmentTag() {
        return equipmentTag;
    }

    public LocalDate getNotificationDate() {
        return notificationDate;
    }

    public Boolean getNotificationSent() {
        return notificationSent;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setReservationId(Long reservationId) {
        this.reservationId = reservationId;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public void setEquipmentTag(Long equipmentTag) {
        this.equipmentTag = equipmentTag;
    }

    public void setNotificationDate(LocalDate notificationDate) {
        this.notificationDate = notificationDate;
    }

    public void setNotificationSent(Boolean notificationSent) {
        this.notificationSent = notificationSent;
    }
}