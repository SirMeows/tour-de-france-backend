package special.person.templbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import special.person.templbackend.entity.Entity2;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public interface Entity2Repository extends JpaRepository<Entity2, Long> {

    default Map<Long, Entity2> findAllMap() {
        return findAll().stream().collect(Collectors.toMap(Entity2::getId, v -> v));
    }
}