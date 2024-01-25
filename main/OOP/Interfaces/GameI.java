package OOP.Interfaces;

import java.util.ArrayList;
import OOP.Hero;

public interface GameI {
    void gameStep(ArrayList<Hero> teamEnemy, ArrayList<Hero> teamAllias);
}