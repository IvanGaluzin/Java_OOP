package OOP;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        heroesWhite = generateCommand(0);
        heroesBlack = generateCommand(3);
        
        System.out.println("-----------------------------------------");
        heroesWhite.forEach(n -> System.out.println(n.toString())); 
        System.out.println();
        System.out.println("VS");
        System.out.println();
        heroesBlack.forEach(n -> System.out.println(n.toString()));
        System.out.println("-----------------------------------------");

    }

    static ArrayList<Hero> heroesWhite = new ArrayList<>();
    static ArrayList<Hero> heroesBlack = new ArrayList<>();

    static ArrayList<Hero> generateCommand(int n){
        ArrayList<Hero> commandHeroes = new ArrayList<>();
        Random random = new Random();
        int rand;


        for (int i = 0; i < 10; i++) {
            rand = random.nextInt(1,5)+n;
            switch (rand){
                case 1:
                    commandHeroes.add(new Crossbower(getName(), i, i));
                    break;
                case 2:
                    commandHeroes.add(new Monk(getName(), i, i));
                    break;
                case 4:
                    commandHeroes.add(new Peasant(getName(), i, i));
                    break;
                case 3:
                    commandHeroes.add(new Pikeman(getName(), i, i));
                    break;
                case 5:
                    commandHeroes.add(new Rogue(getName(), i, i));
                    break;
                case 6:
                    commandHeroes.add(new Sniper(getName(), i, i));
                    break;
                case 7:
                    commandHeroes.add(new Wizard(getName(), i, i));
                    break;

            }
        }
        return commandHeroes;
    }

    static String getName(){
        return NameOfHeroes.values()[new Random().nextInt(NameOfHeroes.values().length-1)].name();
    }
}
