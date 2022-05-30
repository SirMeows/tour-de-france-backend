package special.person.templbackend.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import special.person.templbackend.entity.CyclistBuilder;
import special.person.templbackend.entity.Team;
import special.person.templbackend.repository.CyclistRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CyclistServiceTest {

    private CyclistService cService;

    @Autowired
    private CyclistRepository cRepository;

    @BeforeEach
    void setUp() {
        cService = new CyclistService(cRepository);
    }

    @Test
    void getCyclists_repositoryIsEmpty() {
        assertEquals(0, cService.getCyclists().size());
    }

    @Test
    void getCyclists_twoSavedInRepository() {
        var c_1 = CyclistBuilder.create()
                .addFakeInfo()
                .build();

        var c_2 = CyclistBuilder.create()
                .addFakeInfo()
                .build();

        cRepository.saveAll(List.of(c_1, c_2));

        assertEquals(2, cService.getCyclists().size());
    }
}