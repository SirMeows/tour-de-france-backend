package special.person.templbackend.api;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import special.person.templbackend.dto.CyclistDto;
import special.person.templbackend.service.CyclistService;
import java.util.Set;
import static special.person.templbackend.config.ModelMapperConfig.SET_TYPE_CYCLIST_DTO;

@AllArgsConstructor
@RestController
@RequestMapping("/api/cyclists")
public class CyclistController {

    private ModelMapper modelMapper;

    private CyclistService cyclistService;

    @GetMapping
    Set<CyclistDto> getCyclists() {
        var entities = cyclistService.getCyclists();
        Set<CyclistDto> dtos = modelMapper.map(entities, SET_TYPE_CYCLIST_DTO);
        return dtos;
    }
}
