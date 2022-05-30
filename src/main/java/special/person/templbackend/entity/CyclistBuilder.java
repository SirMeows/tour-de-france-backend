package special.person.templbackend.entity;

public class CyclistBuilder {

    private Cyclist cyclist;

    private CyclistBuilder() {
    }

    public static CyclistBuilder create() {
        var cBuilder = new CyclistBuilder();
        var cyclist = new Cyclist();
        cBuilder.setCyclist(cyclist);
        return cBuilder;
    }

    public static CyclistBuilder create(String firstName, String lastName, Team team) {
        var cBuilder = new CyclistBuilder();
        var cyclist = new Cyclist();
        cyclist.setFirstName(firstName);
        cyclist.setLastName(lastName);
        cyclist.setTeam(team);
        cBuilder.setCyclist(cyclist);
        return cBuilder;
    }

    private void setCyclist(Cyclist cyclist) {
        this.cyclist = cyclist;
    }

    public CyclistBuilder addFirstName(String firstName) {
        cyclist.setFirstName(firstName);
        return this;
    }

    public CyclistBuilder addLastName(String lastName) {
        cyclist.setLastName(lastName);
        return this;
    }

    public CyclistBuilder addTeam(Team team) {
        cyclist.setTeam(team);
        return this;
    }

    public CyclistBuilder addFakeInfo() {
        var team = TeamBuilder.create("zzz").build();

        addFirstName("xxx");
        addLastName("yyy");
        addTeam(team);
        return this;
    }

    public Cyclist build() {
        var temp = cyclist;
        cyclist = null;
        return temp;
    }
}
