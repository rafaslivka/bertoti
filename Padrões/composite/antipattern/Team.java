package composite.antipattern;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Object> members = new ArrayList<>();

    public void addMember(Developer developer) {
        members.add(developer);
    }

    public void addMember(Team team) {
        members.add(team);
    }

    public void showMembers() {
        for (Object member : members) {
            if (member instanceof Developer) {
                System.out.println("Developer: " + ((Developer) member).getName());
            } else if (member instanceof Team) {
                System.out.println("Sub-team:");
                ((Team) member).showMembers();
            } else {
                System.out.println("Unknown member type");
            }
        }
    }
}
