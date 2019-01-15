import java.util.Random;

public class Personnage	 {
	private int hp, force, intelligence, agilité, constitution;
	private int lvl;
	private String nompers;
	private String messageEtat;
	Random rand = new Random();
	int randomDamage = rand.nextInt(3) + 4;
	public Personnage (String nompers, int hp, int force, int intelligence, int agilité, int constitution, int lvl) {
		this.nompers = nompers;
		this.hp = hp;
		this.force = force;
		this.intelligence = intelligence;
		this.agilité = agilité;
		this.constitution = constitution;
		this.lvl = lvl;}
	
		
		
		private void recevoirDegatsPhysique() {
			 
            this.hp -= force / 2 + randomDamage;

            if(hp < 0) 
                    hp = 0;}
            
        public void attaque(Personnage personnageCible) {
        	personnageCible.recevoirDegatsPhysique();}
        	
        		public boolean alive() {
                
        			if(this.getHp() > 0) {
        				messageEtat = "Vivant";
        				return true;
        			}
        			else {
        				messageEtat = "Mort";
        				return false;
        			}
        		}
 
        		public int getHp() {

        			return this.hp;
		
	}
        		public void ThrallAfficher() {
        	        	System.out.println("Thrall à "+ this.hp +"hp");
        }        
}
      
