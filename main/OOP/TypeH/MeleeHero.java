package OOP.TypeH;

import OOP.Hero;
import OOP.Vector2D;
import java.util.ArrayList;

public abstract class MeleeHero extends Hero {
    int step, damagePoint;

    public MeleeHero(int health, int healthMax, int armor, int[] damage, String nameHero, int posX, int posY, int step) {
        super(health, healthMax, armor, damage, nameHero, posX, posY, 2);
        this.step = step;
    }

    public void getDamage(Hero target) {
        damagePoint = this.random.nextInt(damage[0], damage[1]);
        target.health = target.health - damagePoint;
        if (target.health < 0){
            target.health = 0;
        }
    }

    @Override
    public String getType() {
        return "Melee";
    }

    public Hero findBestEnemyMDD(ArrayList<Hero> enemys) {
        Hero heroTMP = null;
        for (int i = 0; i < enemys.size(); i++) {
            if (enemys.get(i).health>0) {
                if (heroTMP == null || this.position.rangeEnemy(enemys.get(i).position) < this.position.rangeEnemy(heroTMP.position)) {
                    heroTMP = enemys.get(i);
                }
            }
        }
        return heroTMP;
    }

    public Vector2D getStepMDD(Hero enemy) {
        Vector2D delta = position.getDelta(enemy.position);
        Vector2D tmpVector2 = new Vector2D(position.posX, position.posY);
        if (delta.posX < 0) {
            tmpVector2.posX++;
            return tmpVector2;
        }
        if (delta.posX > 0) {
            tmpVector2.posX--;
            return tmpVector2;
        }
        if (delta.posY < 0) {
            tmpVector2.posY++;
            return tmpVector2;
        }
        if (delta.posY > 0) {
            tmpVector2.posY--;
            return tmpVector2;
        }
        return tmpVector2;

    }

    @Override
    public String toString() {
        return (nameHero + " здоровье: " + health + "/" + healthMax + " броня: " + armor);
    }

    @Override
    public void gameStep(ArrayList<Hero> teamEnemy, ArrayList<Hero> teamAllies) {
        if (this.health == 0) return;
        Hero tmpHero = findBestEnemyMDD(teamEnemy);
        if (position.rangeEnemy(tmpHero.position) < 2) {
            getDamage(tmpHero);
        } else {
            Vector2D tmpVec = getStepMDD(tmpHero);
            boolean step = true;
            for (Hero hero : teamAllies) {
                if (tmpVec.equals(hero.position) && hero.health>0) step = false;
            }
            if (step) position = tmpVec;
        }
    }
}