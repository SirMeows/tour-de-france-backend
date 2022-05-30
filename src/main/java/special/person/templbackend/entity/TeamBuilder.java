package special.person.templbackend.entity;

public class TeamBuilder {

    private Team team;

    private TeamBuilder() {
    }

    public static TeamBuilder create() {
        var tBuilder = new TeamBuilder();
        var team = new Team();
        tBuilder.setTeam(team);
        return tBuilder;
    }

    public static TeamBuilder create(String name) {
        var cBuilder = new TeamBuilder();
        var team = new Team();
        team.setName(name);
        cBuilder.setTeam(team);
        return cBuilder;
    }

    private void setTeam(Team team) {
        this.team = team;
    }

    public TeamBuilder addName(String name) {
        team.setName(name);
        return this;
    }

    public Team build() {
        var temp = team;
        team = null;
        return temp;
    }
}
