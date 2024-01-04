package OOP;


import OOP.Interfaces.Warrior;

import java.util.Random;

public class Rogue extends Hero implements Warrior {

    public Rogue(String nameHero, int posX, int posY) {
        super(100, 100, 5, new int[]{20, 30}, nameHero, posX, posY);
    }
Random random = new Random();



    @Override
    public String toString() {
        return ("Разбойник: " + nameHero + " здоровье: " + health + "/" + healthMax + " броня: " + armor);
    }

    @Override
    public void getDamage(Hero target) {
       
            target.health = target.health - random.nextInt(damage[0],damage[1]);
        
    }
}
