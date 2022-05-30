package special.person.templbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import special.person.templbackend.entity.Team;
import java.util.HashSet;
import java.util.Set;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

    default Set<Team> findAllSet() {
        return new HashSet<>(findAll());
    }
}