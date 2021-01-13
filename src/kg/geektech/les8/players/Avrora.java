package kg.geektech.les8.players;


import kg.geektech.les8.game.RPG_Game;

public class Avrora extends Hero {

    public Avrora(int health, int damage) {
        super(health, damage, SuperAbility.INVISIBLE);

    }


    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int a;
        int b;
        a = boss.getDamage() / 5;

        b = boss.getDamage() - a;

        if (RPG_Game.number != 3 && RPG_Game.number !=2 ) {
            if (heroes[5].getHealth() > 0) {
                setHealth(getHealth()+ b);
                boss.setHealth(boss.getHealth() - b);
                System.out.println(RPG_Game.ANSI_RED + "Avrora "+RPG_Game.ANSI_RESET+ RPG_Game.ANSI_BLUE  +"невидвимка !" + RPG_Game.ANSI_RESET);
                System.out.println(RPG_Game.ANSI_RED + "Avrora"+RPG_Game.ANSI_RESET +RPG_Game.ANSI_BLUE+ " возвращает урон боссу"  + RPG_Game.ANSI_RESET);
            } else if (heroes[5].getHealth() < 0) {

                setHealth((getHealth() + getDamage()));
                boss.setHealth(boss.getHealth() - boss.getDamage());
                System.out.println(RPG_Game.ANSI_RED + "Avrora "+RPG_Game.ANSI_RESET+ RPG_Game.ANSI_BLUE  +"невидвимка !" + RPG_Game.ANSI_RESET);
                System.out.println(RPG_Game.ANSI_RED + "Avrora"+RPG_Game.ANSI_RESET +RPG_Game.ANSI_BLUE+ " возвращает урон боссу"  + RPG_Game.ANSI_RESET);
            }
        }
    }
}