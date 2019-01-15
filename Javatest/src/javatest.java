import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class javatest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Cairne");
		list.add("Thrall");
		list.add("Sylvannas");
		list.add("VolJin");
		/*int Cairne = 45;
		int Thrall = 40;
		int Sylvannas = 30;
		int VolJin = 20;
		int Varian = 45;
		int Magni = 40;
		int Malfurion = 30;
		int Tyrande = 20;
		boolean Variandmg = true;
		Random rand = new Random();
		int randomDamage = rand.nextInt(3) + 4;
		Scanner scan = new Scanner(System.in);
		
		if (Variandmg = true) {
			Cairnehp -= randomDamage;
		}
		System.out.println("Votre personnage a perdu  "+ randomDamage +" HP ");
		System.out.println("Personnage 1 à "+ Cairnehp + " HP ");*/
		Collections.shuffle(list);
		System.out.println(list);
		
	}
	
}
