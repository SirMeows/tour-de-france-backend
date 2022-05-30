package special.person.templbackend.api;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;
import special.person.templbackend.dto.CyclistDto;
import special.person.templbackend.dto.TeamDto;
import special.person.templbackend.entity.Cyclist;
import special.person.templbackend.service.CyclistService;
import special.person.templbackend.service.TeamService;
import java.util.Set;

import static special.person.templbackend.config.ModelMapperConfig.SET_TYPE_CYCLIST_DTO;
import static special.person.templbackend.config.ModelMapperConfig.SET_TYPE_TEAM_DTO;

@AllArgsConstructor
@RestController
@RequestMapping("/api/teams")
public class TeamController {

    private ModelMapper mm;

    private TeamService tService;

    private CyclistService cService;

    @GetMapping
    Set<TeamDto> getTeams() {
        var entities = tService.getTeams();
        Set<TeamDto> dtos = mm.map(entities, SET_TYPE_TEAM_DTO);
        return dtos;
    }

    @GetMapping("/{id}/cyclist")
    Set<CyclistDto> getTeamMembers(@PathVariable Long id) {
        var team = tService.getTeamById(id);
        Set<Cyclist> cyclists = cService.getCyclistsByTeam(team);
        return mm.map(cyclists, SET_TYPE_CYCLIST_DTO);
    }
}