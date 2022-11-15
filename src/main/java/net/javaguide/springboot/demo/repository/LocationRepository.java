package net.javaguide.springboot.demo.repository;

import net.javaguide.springboot.demo.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
