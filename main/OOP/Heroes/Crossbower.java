package OOP.Heroes;

import OOP.TypeH.RangeHero;

public class Crossbower extends RangeHero {

    public Crossbower(String nameHero, int posX, int posY) {
        super(75, 75, 2, new int[]{10, 15}, nameHero, posX, posY, 0, 7, 4);
        angryRDD = new Pikeman(this.nameHero, this.position.posX, this.position.posY);
        angryRDD.position = this.position;
        angryRDD.damage = new int[] {9, 10};
    }

    @Override
    public String toString() {
        return "Арбалетчик: " + super.toString();
    }

    @Override
    public String getInfo() {
        return "Арбалетчик";
    }
}