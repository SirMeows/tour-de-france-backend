package special.person.templbackend.api;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;
import special.person.templbackend.service.Entity1Service;
import special.person.templbackend.service.Entity2Service;

@AllArgsConstructor
@RestController
@RequestMapping("/api/entity1")
public class Entity1Controller {

    private ModelMapper modelMapper;

    private Entity1Service entity1Service;

    private Entity2Service entity2Service;
}