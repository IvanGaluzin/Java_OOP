package OOP;

import OOP.Interfaces.Healer;

import java.util.Random;

public class Wizard extends Hero implements Healer {

    public Wizard(String nameHero, int posX, int posY) {
        super(50, 50, 1, new int[]{-35, -30}, nameHero, posX, posY);
    }
    Random random = new Random();

    @Override
    public String toString() {
        return ("Колдун: " + nameHero + " здоровье: " + health + "/" + healthMax + " броня: " + armor);
    }

    @Override
    public void getHealing(Hero target) {
        target.health = target.health + random.nextInt(damage[0], damage[1]);
    }
}
