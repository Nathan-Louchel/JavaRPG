package projetrpg.java;

public class main {
	public static void main(String[] args) {
		//Map<String. Integer> map = new HashMap<>;
		
		

		
		Personnage Cairne = new Personnage("Cairne",45, 20, 0, 8, 40, 1);
		Personnage Thrall = new Personnage("Thrall",35, 16, 10, 5, 30, 1);

		do {
			Thrall.attaque(Cairne,false);
			Cairne.attaque(Thrall,false);
			Thrall.ThrallAfficher();
			Cairne.CairneAfficher();
		}while (Cairne.alive() && Thrall.alive());
	}
	
	
}
