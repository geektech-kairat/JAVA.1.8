package kg.geektech.les8.players;

import kg.geektech.les8.game.RPG_Game;

import static kg.geektech.les8.game.RPG_Game.ANSI_RESET;
import static kg.geektech.les8.game.RPG_Game.number;

public class Magic extends Hero {
    public Magic(int health, int damage) {
        super(health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (number == 3) {
            for (Hero hero : heroes) {
                hero.setDamage(hero.getDamage() + RPG_Game.random);
                System.out.println();
            }
            System.out.println(RPG_Game.ANSI_RED+"Magic увеличил урон герояев на : "+RPG_Game.ANSI_RESET+ RPG_Game.ANSI_BLUE+ RPG_Game.random+RPG_Game.ANSI_RESET);


        } else {
            System.out.println(RPG_Game.ANSI_RED+"Босс заблокировал магию "+ANSI_RESET + RPG_Game.ANSI_BLUE+"Мага"+RPG_Game.ANSI_RESET);
        }
    }
}

