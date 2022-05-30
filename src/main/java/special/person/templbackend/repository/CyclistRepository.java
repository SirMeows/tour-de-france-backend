package special.person.templbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import special.person.templbackend.entity.Cyclist;
import special.person.templbackend.entity.Team;

import java.util.HashSet;
import java.util.Set;

@Repository
public interface CyclistRepository extends JpaRepository<Cyclist, Long> {

    default Set<Cyclist> findAllSet() {
        return new HashSet<>(findAll());
    }

    Set<Cyclist> findByFirstNameOrLastNameOrderByLastName(String firstName, String lastName);

    Set<Cyclist> findAllByTeamOrderByLastName(Team team);
}