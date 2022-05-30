package special.person.templbackend.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import special.person.templbackend.dto.CyclistDto;
import special.person.templbackend.dto.TeamDto;
import java.lang.reflect.Type;
import java.util.Set;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    public static final Type LIST_TYPE_TEAM_DTO = new TypeToken<Set<TeamDto>>() {
    }.getType();

    public static final Type LIST_TYPE_CYCLIST_DTO = new TypeToken<Set<CyclistDto>>() {
    }.getType();
}