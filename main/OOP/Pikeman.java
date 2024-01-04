package OOP;

import OOP.Interfaces.Warrior;

import java.util.Random;

public class Pikeman extends Hero implements Warrior{

    public Pikeman(String nameHero, int posX, int posY) {
        super(100, 100, 5, new int[]{20, 30}, nameHero, posX, posY);
    }
Random random = new Random();

    @Override
    public String toString() {
        return ("Копейщик: " + nameHero + " здоровье: " + health + "/" + healthMax + " броня: " + armor);
    }

    @Override
    public void getDamage(Hero target) {
        
            target.health = target.health - random.nextInt(damage[0],damage[1]);
        
    }
}
