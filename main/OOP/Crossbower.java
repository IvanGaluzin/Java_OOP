package OOP;

import OOP.Interfaces.Shooter;

import java.util.Random;

public class Crossbower extends Hero implements Shooter {

    public Crossbower(String nameHero, int posX, int posY) {
        super(75, 75, 2, new int[]{10, 15}, nameHero, posX, posY);
        rangeMaxDamage = 4;
        quantityShots = 5;
    }

    Random random = new Random();
    protected int rangeMaxDamage;
    protected int quantityShots;

    @Override
    public String toString() {
        return ("Арбалетчик: " + nameHero + " здоровье: " + health + "/" + healthMax + " броня: " + armor);
    }

    @Override
    public void getShoot(Hero target) {
        if (quantityShots > 0) {
            if (this.position.rangeEnemy(target.position) < rangeMaxDamage) {
                target.health = target.health - random.nextInt(damage[0], damage[1]);
            } else {
                target.health = target.health - damage[0];
            }
        }

    }
}