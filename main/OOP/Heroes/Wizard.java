package OOP.Heroes;

import OOP.TypeH.HealerHero;

public class Wizard extends HealerHero {

    public Wizard(String nameHero, int posX, int posY) {
        super(50, 50, 1, new int[]{10, 15}, nameHero, posX, posY, 50, 50);
    }

    @Override
    public String toString() {
        return ("Колдун: " + super.toString());
    }

    @Override
    public String getInfo() {
        return "Колдун";
    }

}