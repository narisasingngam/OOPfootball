package football;

public class Main {
	public static void main(String[] args) {
		Game g = new Game();
		g.addTeamMember(2, "TeamA");
		g.addTeamMember(2, "TeamB");
		g.goal("TeamA");
		g.goal("TeamB");
	}
}
