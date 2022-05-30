package special.person.templbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import special.person.templbackend.entity.Cyclist;
import java.util.HashSet;
import java.util.Set;

@Repository
public interface CyclistRepository extends JpaRepository<Cyclist, Long> {

    default Set<Cyclist> findAllSet() {
        return new HashSet<>(findAll());
    }
}