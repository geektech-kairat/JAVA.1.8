package kg.geektech.les8.players;

import kg.geektech.les8.game.RPG_Game;

import static kg.geektech.les8.game.RPG_Game.number;

public class Voron extends Hero {
    private int helping;

    public void setHelping(int helping) {
        this.helping = helping;
    }

    public int getHelping() {
        return helping;
    }

    public Voron(int health, int damage, int helping) {
        super(health, damage, SuperAbility.BOOST);
        this.helping = helping;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (number != 3) {
            int b = boss.getHealth() / 2;
            int d = boss.getDamage() / 2;
            System.out.println(RPG_Game.ANSI_RED + "Voron увеличивает способность медика лечить героев на; " + RPG_Game.ANSI_RESET + RPG_Game.ANSI_BLUE + getHelping() + RPG_Game.ANSI_RESET);
            if (boss.getHealth() < b) {
                boss.setDamage(boss.getDamage() + d);
                System.out.println(RPG_Game.ANSI_RED + "У босса проявляется агрессия, увеличивается урон на 50% " + RPG_Game.ANSI_RESET);

            }
            for (Hero hero : heroes) {
                if (hero.getHealth() != heroes[3].getHealth()) {
                    hero.setHealth(hero.getHealth() + this.getHelping());

                }
            }
        }
    }
}

