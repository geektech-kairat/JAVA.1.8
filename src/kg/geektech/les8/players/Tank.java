package kg.geektech.les8.players;

import kg.geektech.les8.game.RPG_Game;

public class Tank extends Hero {
    public Tank(int health, int damage) {
        super(health, damage, SuperAbility.GET_BOSS_DAMAGE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

        if (RPG_Game.number != 3) {
            System.out.println(RPG_Game.ANSI_RED + "Танк забрал" + RPG_Game.ANSI_RESET + RPG_Game.ANSI_BLUE + 1 / 5 + " часть урона босса " + RPG_Game.ANSI_RESET);

            int a;
            a = boss.getDamage() / 5;

            for (Hero hero : heroes) {
                if (hero != heroes[6]) {
                    hero.setHealth(hero.getHealth() + a);
                    setHealth(getHealth() - a);
                }
            }
        }
    }
}

