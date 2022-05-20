package special.person.templbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestEntity1Repository extends JpaRepository<TestEntity1Repository, Long> {
}
