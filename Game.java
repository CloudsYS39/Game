public class Game {
    
    public static void main(String[] args){

        // membuat objek player
        Player Knight = new Player();
        Player Enemy = new Player();
        // mengisi atribut player
        Knight.name = "AccessCode Talker";
        Knight.SPD = 100;
        Knight.HP = 100;
        Knight.ATK = 100;
        Knight.DEF = 100;
        Knight.Damage = 100;
        Knight.Armor = 100;

        Enemy.name = "Blue Eyes White Dragon";
        Enemy.SPD = 100;
        Enemy.HP = 100;
        Enemy.ATK = 100;
        Enemy.DEF = 100;
        Enemy.Damage = 100;
        Enemy.Armor = 100;

        // menjalankan method
        Knight.run();
        Knight.attack(Enemy.name);
        Knight.Defend(Enemy.name + "'s Attack");

        if(Knight.isDead()){
            System.out.println("NOOB!");
        }

    }
}
