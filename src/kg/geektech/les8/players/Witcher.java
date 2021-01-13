package kg.geektech.les8.players;

import kg.geektech.les8.game.RPG_Game;

public class Witcher extends Hero {
    public Witcher(int health, int damage) {
        super(health, damage, SuperAbility.ANIMATE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (boss.getHealth() > 0 && getHealth() > 0  ) {

            for (int i = 0; i < heroes.length; i++) {
                if (heroes[i].getHealth() <= 0 ) {
                    heroes[i].setHealth(heroes[i].getHealth() + getHealth());
                    setHealth(0);
                    System.out.println(RPG_Game.ANSI_RED +"Witcher оживил " + RPG_Game.ANSI_RESET + RPG_Game.ANSI_BLUE+ heroes[i].getClass().getSimpleName() +RPG_Game.ANSI_RESET+ RPG_Game.ANSI_RED + "  и сам умер " + RPG_Game.ANSI_RESET );
                    break;
                }
            }

        }
    }
}
