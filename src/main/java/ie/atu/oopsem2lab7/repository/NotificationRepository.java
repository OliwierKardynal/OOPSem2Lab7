package ie.atu.oopsem2lab7.repository;

import ie.atu.oopsem2lab7.model.NotificationRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<NotificationRecord, Long> {
}