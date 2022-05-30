package special.person.templbackend.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import special.person.templbackend.entity.Team;
import special.person.templbackend.repository.TeamRepository;

import java.util.Set;

@AllArgsConstructor
@Service
public class TeamService {

    private TeamRepository tRepository;

    public Set<Team> getTeams() {
        return tRepository.findAllSet();
    }
}
