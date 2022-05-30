package special.person.templbackend.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import special.person.templbackend.entity.Cyclist;
import special.person.templbackend.entity.Team;
import special.person.templbackend.error.CyclistNotFoundException;
import special.person.templbackend.repository.CyclistRepository;

import java.util.Set;

@AllArgsConstructor
@Service
public class CyclistService {

    private CyclistRepository cRepository;

    public Set<Cyclist> getCyclists() {
        return cRepository.findAllSet();
    }

    public Cyclist getCyclistById(Long id) {
        return cRepository.findById(id).orElseThrow(() -> new CyclistNotFoundException(id));
    }

    public Cyclist addCyclist(Cyclist cyclist) {
        return cRepository.save(cyclist);
    }

    public Cyclist editCyclist(Cyclist cyclist) {
        return cRepository.save(cyclist);
    }

    public void deleteCyclist(Long id) {
        cRepository.deleteById(id);
    }

    public Set<Cyclist> getCyclistsByName(String searchTerm) {
        return cRepository.findByFirstNameOrLastNameOrderByLastName(searchTerm, searchTerm);
    }

    public Set<Cyclist> getCyclistsByTeam(Team team) {
        return cRepository.findAllByTeamOrderByLastName(team);
    }
}
