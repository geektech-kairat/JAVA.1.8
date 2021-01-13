package kg.geektech.les8.players;

import kg.geektech.les8.game.RPG_Game;

public class Furion extends Hero {
    public Furion(int health, int damage) {
        super(health, damage, SuperAbility.CALL);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (boss.getHealth() > 0 && getHealth() > 0 && RPG_Game.number ==2) {

            for (int i = 0; i < heroes.length; i++) {
                if (heroes[i].getHealth() > 0 ) {

                    boss.setHealth(boss.getHealth() - heroes[i].getDamage());
                    System.out.println(RPG_Game.ANSI_RED +"Furion призвал героя на один раунд  : "+RPG_Game.ANSI_RESET+ RPG_Game.ANSI_BLUE + heroes[i].getClass().getSimpleName()+ RPG_Game.ANSI_RESET );

                    break;
                }
            }
            }else if (boss.getHealth() > 0 && getHealth() > 0 &&RPG_Game.number == 3){
            boss.setHealth(boss.getHealth()- 50);
            System.out.println(RPG_Game.ANSI_RED+"Furion призвал Негира урон 50ед на один раунд "+RPG_Game.ANSI_RESET);
        }

        }
    }
