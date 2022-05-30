package special.person.templbackend.api;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;
import special.person.templbackend.service.TeamService;

@AllArgsConstructor
@RestController
@RequestMapping("/api/teams")
public class TeamController {

    private ModelMapper modelMapper;

    private TeamService teamService;
}