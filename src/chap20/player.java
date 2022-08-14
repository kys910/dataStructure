package chap20;

public class player {
    private String first_name;
    private String last_name;
    private String team;

    public player(String first_name, String last_name, String team) {
        this.first_name = first_name.trim();
        this.last_name = last_name.trim();
        this.team = team.trim();
    }

    public String getFullName(){
        return first_name + " " + last_name;
    }
}
