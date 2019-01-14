import java.util.Random;
import java.util.Scanner;

public class javatest {
	public static void main(String[] args) {
		int personnage1hp = 45;
		int personnage2hp = 40;
		int personnage3hp = 30;
		int personnage4hp = 20;
		boolean ennemy1dmg = true;
		Random rand = new Random();
		int randomDamage = rand.nextInt(3) + 4;
		
		//Scanner scan = new Scanner(System.in);
		if (ennemy1dmg = true) {
			personnage1hp -= randomDamage;
		}
		System.out.println("Votre personnage a perdu  "+ randomDamage +" HP ");
		System.out.println("Personnage 1 à "+ personnage1hp + " HP ");
	}
	
}







//