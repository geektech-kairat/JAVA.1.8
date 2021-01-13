package kg.geektech.les8.players;

import kg.geektech.les8.game.RPG_Game;

public class Berserk extends Hero {
    public Berserk(int health, int damage) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (RPG_Game.number != 3) {
            int damageRandom = 1 + (int) (Math.random() * boss.getDamage());
            if (boss.getHealth() > 0 && getHealth() > 0) {
                boss.setHealth(boss.getHealth() - damageRandom);
                System.out.println(RPG_Game.ANSI_RED + "BERSERK отнял жизнь босса  дополнительно на : " + RPG_Game.ANSI_RESET + RPG_Game.ANSI_BLUE + damageRandom + RPG_Game.ANSI_RESET);


            }
        }

    }
}
