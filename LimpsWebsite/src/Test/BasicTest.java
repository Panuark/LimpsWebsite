package Test;
import java.util.Date;

import baseDeDonnees.*;


public class BasicTest {
public static void main(String[] args) {
	Compte captain = new Compte("captain", "azerty", "a", "b");
	Compte captain2 = new Compte("captain", "azerty", "a", "b");
	Team team=new Team("numberouno", captain);
	Match match = new Match(10, team, team, new Date());
	System.out.println(captain2.setTeam(team));
	System.out.println(captain2.setTeam(team));
	System.out.println(team);
	System.out.println(match);
	
	Tournoi a = new Tournoi();
	a.ajouterMatchPoules(match);
	a.ajouterTeams(team);
	System.out.println(a);
	}
}
