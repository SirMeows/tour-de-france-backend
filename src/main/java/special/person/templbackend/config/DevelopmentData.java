package special.person.templbackend.config;

import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import special.person.templbackend.entity.Cyclist;
import special.person.templbackend.entity.CyclistBuilder;
import special.person.templbackend.entity.Team;
import special.person.templbackend.entity.TeamBuilder;
import special.person.templbackend.repository.CyclistRepository;
import special.person.templbackend.repository.TeamRepository;
import java.util.List;

@AllArgsConstructor
@Controller
@Profile("!test")
public class DevelopmentData implements ApplicationRunner {

    private CyclistRepository cRepository;
    private final List<Team> teams;
    private final List<Cyclist> cyclists;

    private void makeTeams() {

        var t_1 = TeamBuilder
                .create("Trek - Segafredo")
                .build();

       var  t_2 = TeamBuilder
                .create("Quick-Step Alpha Vinyl Team")
                .build();

        var t_3 = TeamBuilder
                .create("Jumbo-Visma")
                .build();

        teams.addAll(List.of(t_1, t_2,t_3));
    }

    private void makeCyclists() {

        var c_1 = CyclistBuilder
                .create()
                .addFirstName("Mads")
                .addLastName("Pedersen")
                .addTeam(teams.get(0))
                .build();

        var c_2 = CyclistBuilder
                .create()
                .addFirstName("Quinn")
                .addLastName("Simmons")
                .addTeam(teams.get(0))
                .build();

        var c_3 = CyclistBuilder
                .create()
                .addFirstName("Michael")
                .addLastName("Mørkøv")
                .addTeam(teams.get(1))
                .build();

        var c_4 = CyclistBuilder
                .create()
                .addFirstName("Kasper")
                .addLastName("Asgreen")
                .addTeam(teams.get(1))
                .build();

        var c_5 = CyclistBuilder
                .create()
                .addFirstName("Sepp")
                .addLastName("Kuss")
                .addTeam(teams.get(2))
                .build();

        var c_6 = CyclistBuilder
                .create()
                .addFirstName("Jonas")
                .addLastName("Vingegaard")
                .addTeam(teams.get(2))
                .build();

        var c_7 = CyclistBuilder
                .create()
                .addFirstName("Wout")
                .addLastName("Van Aert")
                .addTeam(teams.get(2))
                .build();

        cyclists.addAll(List.of(c_1, c_2, c_3, c_4, c_5, c_6, c_7));
        cRepository.saveAll(cyclists);
    }

    @Override
    public void run(ApplicationArguments args) {
        makeTeams();
        makeCyclists();
    }
}
