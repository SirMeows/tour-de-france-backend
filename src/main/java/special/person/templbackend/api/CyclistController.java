package special.person.templbackend.api;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import special.person.templbackend.service.CyclistService;

@AllArgsConstructor
@RestController
@RequestMapping("/api/cyclists")
public class CyclistController {

    private ModelMapper modelMapper;

    private CyclistService cyclistService;
}
