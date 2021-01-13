package kg.geektech.les8.players;

import kg.geektech.les8.game.RPG_Game;

public class Warrior extends Hero {
    public Warrior(int health, int damage) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int a = 2 + (int) (Math.random() * 2);
        if (boss.getHealth() > 0 && getHealth() > 0) {
            int b = getDamage() * a;
            boss.setHealth(boss.getHealth() - b);
            System.out.println(RPG_Game.ANSI_RED +"Warrior критует на :  " + RPG_Game.ANSI_RESET + RPG_Game.ANSI_BLUE + boss.getDamage() * a + RPG_Game.ANSI_RESET );
        }
    }
}
