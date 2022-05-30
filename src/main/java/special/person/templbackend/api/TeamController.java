package special.person.templbackend.api;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;
import special.person.templbackend.dto.TeamDto;
import special.person.templbackend.service.TeamService;
import java.util.Set;
import static special.person.templbackend.config.ModelMapperConfig.SET_TYPE_TEAM_DTO;

@AllArgsConstructor
@RestController
@RequestMapping("/api/teams")
public class TeamController {

    private ModelMapper modelMapper;

    private TeamService teamService;

    @GetMapping
    Set<TeamDto> getTeams() {
        var entities = teamService.getTeams();
        Set<TeamDto> dtos = modelMapper.map(entities, SET_TYPE_TEAM_DTO);
        return dtos;
    }
}