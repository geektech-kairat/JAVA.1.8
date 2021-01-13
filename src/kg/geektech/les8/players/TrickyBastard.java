package kg.geektech.les8.players;


import kg.geektech.les8.game.RPG_Game;

public class TrickyBastard extends Hero {

    public TrickyBastard(int health, int damage) {
        super(health, damage, SuperAbility.INVISIBLE);

    }


    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (RPG_Game.number != 3 && RPG_Game.number !=2 ) {
            if (heroes[5].getHealth() > 0) {
//                int a = boss.getDamage() / 5;
//                int b = boss.getDamage() - a;
                setHealth(getHealth() + 40);
                boss.setHealth(boss.getHealth() - 40);
                System.out.println(RPG_Game.ANSI_RED +"TrickyBastard"+RPG_Game.ANSI_RESET+RPG_Game.ANSI_BLUE +" притворился мертвым на один раунд!"+ RPG_Game.ANSI_RESET);
            } else if (heroes[5].getHealth() < 0) {
                setHealth((getHealth() + getDamage()));
                boss.setHealth(boss.getHealth() - boss.getDamage()) ;
                System.out.println(RPG_Game.ANSI_RED +"TrickyBastard притворился мертвым на один раунд!"+RPG_Game.ANSI_RESET );
            }




        }else{
            System.out.println(RPG_Game.ANSI_RED+"Аvrora "+RPG_Game.ANSI_RESET+RPG_Game.ANSI_BLUE +"видим  "+RPG_Game.ANSI_RESET);
        }


    }
}