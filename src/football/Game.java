package football;

public class Game {
	private int teamMemberA;
	private int teamMemberB;
	private FootBallTeamA a;
	private FootBallTeamB b;

	public Game(){
		teamMemberA = 0;
		teamMemberB = 0;
		a = new FootBallTeamA();
		b = new FootBallTeamB();
	}
	
	public void addTeamMember(int num,String team){
		if(team.equals("TeamA")) teamMemberA += num;
		else if(team.equals("TeamB")) teamMemberB += num;
		
	}
	public void goal(String team){
		if(team.equals("TeamA")){
			for (int i = 0; i < teamMemberA; i++) a.team();
			
		}
		else if(team.equals("TeamB")){
			for (int i = 0; i < teamMemberB; i++) b.team();
			
		}
	}
}
