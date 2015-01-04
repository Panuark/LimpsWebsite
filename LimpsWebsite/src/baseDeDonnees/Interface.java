package baseDeDonnees;

import java.util.LinkedList;

public class Interface {
	private static Interface INSTANCE = new Interface();
	LinkedList<Compte> comptes = new LinkedList<Compte>();

	private Interface() {
		// TODO Auto-generated constructor stub
	}
	
	public static Interface getInstance(){
		return INSTANCE;
	}
	
	public void addCompte(String pLogin, String pPassword, String pNom, String pPrenom){
	comptes.add(new Compte(pLogin, pPassword, pNom, pPrenom));
	}
	
	public String getCompte(){
		String st="";
		for(Compte lCompte : comptes){
			st+=lCompte.toString();
			st+="<br>";
		}
		return st;
	}
	
	public boolean connection(String pPseudo, String pMDP){
		boolean bool = false;
		for(Compte compte : comptes){
			if(pPseudo.equals(compte.getLogin()) && pMDP.equals(compte.getPassword())){
				bool= true;
			}
		}
		return bool;
	}
}
