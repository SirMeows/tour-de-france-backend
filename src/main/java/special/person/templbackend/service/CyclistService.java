package special.person.templbackend.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import special.person.templbackend.entity.Cyclist;
import special.person.templbackend.repository.CyclistRepository;

import java.util.Set;

@AllArgsConstructor
@Service
public class CyclistService {

    private CyclistRepository cRepository;

    public Set<Cyclist> getCyclists() {
        return cRepository.findAllSet();
    }
}
