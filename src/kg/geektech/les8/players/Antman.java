package kg.geektech.les8.players;

import kg.geektech.les8.game.RPG_Game;

public class Antman extends Hero {

    public Antman(int health, int damage) {
        super(health, damage, SuperAbility.GET_BOSS_DAMAGE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (getHealth() > 0 && RPG_Game.number != 3) {

            if (RPG_Game.randomForAntman4 > getHealth()) {
                setDamage(getDamage() - RPG_Game.randomForAntman);
                setHealth(getHealth() - RPG_Game.randomForAntman2);
                boss.setHealth(boss.getHealth() - RPG_Game.randomForAntman);

                System.out.println(RPG_Game.ANSI_RED + getClass().getSimpleName() + RPG_Game.ANSI_RESET + RPG_Game.ANSI_BLUE + " Уменьшился на :" + RPG_Game.ANSI_RESET + RPG_Game.ANSI_CYAN + " жизнь; " + RPG_Game.ANSI_RESET + RPG_Game.randomForAntman
                        + "  урон: " + RPG_Game.randomForAntman2);
                setDamage(getDamage() + RPG_Game.randomForAntman);
                setHealth(getHealth() + RPG_Game.randomForAntman2);

            }

            if (RPG_Game.randomForAntman4 < getHealth()) {
                setDamage(getDamage() + RPG_Game.randomForAntman);
                setHealth(getHealth() + RPG_Game.randomForAntman2);
                boss.setHealth(boss.getHealth() - RPG_Game.randomForAntman);
                setHealth((getHealth() + RPG_Game.randomForAntman2));

                System.out.println(RPG_Game.ANSI_RED + getClass().getSimpleName() + RPG_Game.ANSI_RESET + RPG_Game.ANSI_BLUE + " Увеличился на :" + RPG_Game.ANSI_RESET + RPG_Game.ANSI_CYAN + " жизнь; " + RPG_Game.ANSI_RESET + RPG_Game.randomForAntman
                        + "  урон: " + RPG_Game.randomForAntman2);
                setDamage(getDamage() - RPG_Game.randomForAntman);
                setHealth(getHealth() - RPG_Game.randomForAntman2);
            }

        }

    }

}



