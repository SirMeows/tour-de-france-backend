package special.person.templbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import special.person.templbackend.entity.Entity1;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public interface Entity1Repository extends JpaRepository<Entity1, Long> {

    default Map<Long, Entity1> findAllMap() {
        return findAll().stream().collect(Collectors.toMap(Entity1::getId, v -> v));
    }
}
