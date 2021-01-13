package kg.geektech.les8.players;


import kg.geektech.les8.game.RPG_Game;

import static kg.geektech.les8.game.RPG_Game.ANSI_RESET;
import static kg.geektech.les8.game.RPG_Game.randomHealth;

public class Medic extends Hero {

    private int healPoints;

    public Medic(int health, int damage, int healPoints) {
        super(health, damage, SuperAbility.HEAL);
        this.healPoints = healPoints;
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (randomHealth != 3) {
            System.out.println(RPG_Game.ANSI_RED+"Медик лечит всех герояев на : " + RPG_Game.ANSI_RESET + RPG_Game.ANSI_BLUE + healPoints + ANSI_RESET);
            for (Hero hero : heroes) {
                if (hero.getHealth() > 0 && !(hero instanceof Medic && 2 == RPG_Game.number)) {
                    hero.setHealth(hero.getHealth() + healPoints);

                }


            }
        }
        if (randomHealth == 3) {
            System.out.println(RPG_Game.ANSI_RED+"Босс блокнул магию Медика на один раунд" + ANSI_RESET);
        }
    }
}

