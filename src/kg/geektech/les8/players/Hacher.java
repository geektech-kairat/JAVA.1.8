package kg.geektech.les8.players;

import kg.geektech.les8.game.RPG_Game;

public class Hacher extends Hero {
    public Hacher(int health, int damage) {
        super(health, damage, SuperAbility.STEAL_LIFE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int hackHill = 10 + (int) (Math.random() * 20);
        if (boss.getHealth() > 0 && getHealth() > 0) {


            for (Hero hero : heroes) {
                boss.setHealth(boss.getHealth() - hackHill);
                hero.setHealth(hero.getHealth() + hackHill);
                System.out.println(RPG_Game.ANSI_RED + "Hacher украл жизнь босса и подарил  : " + RPG_Game.ANSI_RESET + RPG_Game.ANSI_BLUE + " " + hero.getClass().getSimpleName() + "у  " + RPG_Game.ANSI_RESET + hackHill);
                break;
            }

        }
    }
}

