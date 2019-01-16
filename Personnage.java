package projetrpg.java;

import java.util.Random;

public class Personnage	 {
    private int hp, force, intelligence, agilité, constitution;
    private int lvl;
    private String nompers;
    private String messageEtat;
    Random rand = new Random();
    int randomDamage = rand.nextInt(3) + 4;
    Random luckrand = new Random();
    int randomcounter = rand.nextInt(10);

    public Personnage (String nompers, int hp, int force, int intelligence, int agilité, int constitution, int lvl) {
        this.nompers = nompers;
        this.hp = hp;
        this.force = force;
        this.intelligence = intelligence;
        this.agilité = agilité;
        this.constitution = constitution;
        this.lvl = lvl;
    }

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

    public void attaque(Personnage personnageCible, boolean counter) {
        if (!alive()) {
            System.out.println(this.nompers + " est mort, il ne peut pas attaquer ");
        } else {
            personnageCible.hp -= force / 2 + randomDamage;
            System.out.println(this.nompers + " Attaque " + personnageCible);
        }
    }

    public void checkerrorhp(){
        if (this.hp < 0){
            this.hp = 0;
        }
    }
    public int getHp() {

        return this.hp;

    }
    public void ThrallAfficher() {
        alive();
        checkerrorhp();
        System.out.println("Thrall à "+ this.hp +"hp, " + this.nompers + " est " + this.messageEtat);
    }
    public void CairneAfficher() {
        alive();
        checkerrorhp();
        System.out.println("Cairne à "+ this.hp +"hp, " + this.nompers + " est " + this.messageEtat);
    }
    public String toString() {
        return nompers;
    }
    public void affichercounter() {
        System.out.println(randomcounter);
    }
}

