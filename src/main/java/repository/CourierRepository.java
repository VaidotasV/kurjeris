package lt.kurjeriai.repository;

import lt.kurjeriai.model.Courier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourierRepository extends JpaRepository<Courier, Long> {
}

