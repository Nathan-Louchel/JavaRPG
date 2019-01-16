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



    private void recevoirDegatsPhysique() {

        this.hp -= force / 2 + randomDamage;
        rand.nextInt(10);
        System.out.println(randomcounter);
        if(randomcounter == 9) {
        }

        if(hp < 0) {
            hp = 0;
        }
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
    public void attaque(Personnage personnageCible) {
        if(alive() == false) {
            System.out.println(this.nompers  + " est mort " );
        }
        else { personnageCible.recevoirDegatsPhysique();
            System.out.println(this.nompers + " Attaque " +personnageCible);
        }

    }

    public int getHp() {

        return this.hp;

    }
    public void ThrallAfficher() {
        alive();
        System.out.println("Thrall à "+ this.hp +"hp");
        System.out.println(this.nompers + " est " + this.messageEtat);
    }
    public void CairneAfficher() {
        alive();
        System.out.println("Cairne à "+ this.hp +"hp");
        System.out.println(this.nompers + " est " + this.messageEtat);
    }
    public String toString() {
        return nompers;
    }
    public void affichercounter() {
        System.out.println(randomcounter);
    }
}

