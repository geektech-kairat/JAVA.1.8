package kg.geektech.les8.game;

import kg.geektech.les8.players.*;

public class RPG_Game {

    public static int number;
    public static int random;
    public static int randomForAntman;
    public static int randomForAntman2;
    public static int randomHealth;
    public static int randomForAntman3;
    public static int randomForAntman4;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


    public static void start() {

        Boss boss = new Boss(5000, 50);
        Warrior warrior = new Warrior(270, 10);
        Magic magic = new Magic(230, 6);
        Medic doctor = new Medic(220, 3, 15);
        Berserk berserk = new Berserk(260, 5);
        Hacher hacher = new Hacher(300, 3);
        Tank tank = new Tank(200, 2);
        Witcher witcher = new Witcher(300, 0);
        Avrora avrora = new Avrora(200, 3);
        Thor thor = new Thor(150, 7);
        Furion furion = new Furion(200, 4);
        TrickyBastard trickyBastard = new TrickyBastard(150, 4);
        Voron voron = new Voron(200,7,5);
        Antman antman = new Antman(200,5);
        doctor.setHealPoints(doctor.getHealPoints() + voron.getHelping());

        Hero[] heroes = {warrior, magic, voron, doctor, berserk, hacher, tank, witcher, avrora, thor, furion, trickyBastard, antman};


        printStatistics(boss, heroes);
        while (!isGameFinished(boss, heroes)) {
            round(boss, heroes);
            random = 1 + (int) (Math.random() * 20 - 1);
            randomForAntman3 = antman.getDamage() *2;
            randomForAntman =  (int) (Math.random() * antman.getHealth() );
            randomForAntman2 = (int) (Math.random() * antman.getDamage() );
            randomForAntman4 = (int) (Math.random() * randomForAntman3 );





            int randomHeal = 1 + (int) (Math.random() * 4 - 1);
            randomHealth = randomHeal;
            number = (int) (Math.random() * 5);

        }
    }

    private static void round(Boss boss, Hero[] heroes) {
        applySuperAbilities(boss, heroes);
        heroesHit(boss, heroes);
        bossHits(boss, heroes);
        printStatistics(boss, heroes);
    }

    private static void applySuperAbilities(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                heroes[i].applySuperPower(boss, heroes);
            }
        }
    }

    private static void bossHits(Boss boss, Hero[] heroes) {

        for (Hero hero : heroes) {
            if (heroes[8].getHealth() > 0 && number == 3) {
                System.out.println(ANSI_YELLOW + "босс бропускает один раунд " + ANSI_RESET);
                break;

            } else if (hero.getHealth() > 0) {
                hero.setHealth(hero.getHealth() - boss.getDamage());
            }
        }
    }


    private static void heroesHit(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (boss.getHealth() > 0) {
                boss.setHealth(boss.getHealth() - heroes[i].getDamage());
            }
        }
    }

    private static void printStatistics(Boss boss, Hero[] heroes) {
        int shar = 0;

        System.out.println(ANSI_CYAN + "___________________________________________________________________________________________________________" + ANSI_RESET);
        System.out.println(ANSI_RED + "                            Boss health: " + ANSI_RESET + ANSI_BLUE + boss.getHealth() +  ANSI_GREEN + " Есть вереятность блокнуть  магию воинов  на один раунд  " + ANSI_RESET);
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getClass().getSimpleName().trim().length() > shar) {
                shar = heroes.length;


            }

        }

        for (int i = 0; i < heroes.length; i++) {


            System.out.println(ANSI_RED + "                                    Герой: " + ANSI_RESET + ANSI_BLUE + heroes[i].getClass().getSimpleName() + "::" + ANSI_RESET + ANSI_RED + "Суперсила:::" + ANSI_RESET
                    + ANSI_BLUE + heroes[i].getSuperAbility() + ANSI_RESET + ANSI_RED + ":::health:::" + ANSI_RESET + ANSI_BLUE + heroes[i].getHealth() + ANSI_RESET + ANSI_RED + "::урон " + ANSI_RESET + ANSI_BLUE + " [" +
                    heroes[i].getDamage() + "]" + ANSI_RESET);

        }
        System.out.println(ANSI_CYAN + "______________________________________________________________________________________________________________________________" + ANSI_RESET);
    }


    private static boolean isGameFinished(Boss boss, Hero[] heroes) {
        if (boss.getHealth() <= 0) {
            System.out.println(RPG_Game.ANSI_PURPLE + "Heroes won!!!" + RPG_Game.ANSI_RESET);
            return true;
        }

        boolean allHeroesDead = true;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                allHeroesDead = false;
                break;
            }
        }

        if (allHeroesDead) {
            System.out.println(RPG_Game.ANSI_PURPLE + "Boss won!!" + RPG_Game.ANSI_RESET);
        }

        return allHeroesDead;
    }
}
