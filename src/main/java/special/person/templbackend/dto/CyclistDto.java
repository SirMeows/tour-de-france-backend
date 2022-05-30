package special.person.templbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import special.person.templbackend.entity.Team;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CyclistDto {

    private Long id;

    private String firstName;

    private String lastName;

    private Long teamId;
}
