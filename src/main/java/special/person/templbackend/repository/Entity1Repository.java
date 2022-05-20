package special.person.templbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Entity1Repository extends JpaRepository<Entity1Repository, Long> {

    /*default Map<Long, Entity1> findAllMap() {
        return findAll().stream().collect(Collectors.toMap(Entity1::getId, v -> v))
    }*/
}
