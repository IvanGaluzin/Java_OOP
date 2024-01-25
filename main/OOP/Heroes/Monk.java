package OOP.Heroes;

import OOP.TypeH.HealerHero;

public class Monk extends HealerHero {

    public Monk(String nameHero, int posX, int posY) {
        super(50, 50, 1, new int[]{10, 15}, nameHero, posX, posY, 50, 50);
    }

    @Override
    public String toString() {
        return ("Монах: " + super.toString());
    }
    @Override
    public String getInfo() {
        return "Монах";
    }
}