package special.person.templbackend.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import special.person.templbackend.entity.Team;
import special.person.templbackend.error.TeamNotFoundException;
import special.person.templbackend.repository.TeamRepository;

import java.util.Set;

@AllArgsConstructor
@Service
public class TeamService {

    private TeamRepository tRepository;

    public Set<Team> getTeams() {
        return tRepository.findAllSet();
    }

    public Team getTeamById(Long id) {
        return tRepository.findById(id).orElseThrow(() -> new TeamNotFoundException(id));
    }
}