package OOP;

public class Peasant extends Hero{

    public Peasant(String nameHero, int posX, int posY) {
        super(100, 100, 0, new int[]{0, 0}, nameHero, posX, posY);
    }
    @Override
    public String toString() {
        return ("Крестьянин: " + nameHero + " здоровье: " + health + "/" + healthMax + " броня: " + armor);
    }

}
