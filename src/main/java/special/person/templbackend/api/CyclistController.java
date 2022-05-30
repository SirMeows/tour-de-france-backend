package special.person.templbackend.api;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;
import special.person.templbackend.dto.CyclistDto;
import special.person.templbackend.entity.Cyclist;
import special.person.templbackend.service.CyclistService;
import java.util.Set;
import static special.person.templbackend.config.ModelMapperConfig.SET_TYPE_CYCLIST_DTO;

@AllArgsConstructor
@RestController
@RequestMapping("/api/cyclists")
public class CyclistController {

    private ModelMapper mm;

    private CyclistService cService;

    @GetMapping
    Set<CyclistDto> getCyclists() {
        var cyclists = cService.getCyclists();
        Set<CyclistDto> cyclistDtos = mm.map(cyclists, SET_TYPE_CYCLIST_DTO);
        return cyclistDtos;
    }

    @GetMapping("/{id}")
    CyclistDto getCyclistById(@PathVariable Long id) {
        var cyclist = cService.getCyclistById(id);
        return mm.map(cyclist, CyclistDto.class);
    }

    @GetMapping("/{searchTerm}/name")
    Set<CyclistDto> getCyclistsBySearchTerm(@PathVariable String searchTerm) {
        var cyclists = cService.getCyclistsByName(searchTerm);
        return mm.map(cyclists, SET_TYPE_CYCLIST_DTO);
    }

    @PostMapping
    CyclistDto addCyclist(@RequestBody CyclistDto body) {
        var newCyclist = mm.map(body, Cyclist.class);
        var savedCyclist = cService.addCyclist(newCyclist);
        return mm.map(savedCyclist, CyclistDto.class);
    }

    @PutMapping("/{id}")
    CyclistDto editCyclist(@RequestBody CyclistDto body, @PathVariable Long id) {
        var cyclist = mm.map(body, Cyclist.class);
        var cyclistEdited = cService.editCyclist(id, cyclist);
        return mm.map(cyclistEdited, CyclistDto.class);
    }

    @DeleteMapping("/{id}")
    void deleteCyclist(@PathVariable Long id) {
        cService.deleteCyclist(id);
    }
}
