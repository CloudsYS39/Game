public class Player {
   
  String name; 
  int SPD;
  int HP;
  int ATK;
  int DEF;
  int Armor;
  int Damage;


  void run(){
   
    System.out.println(name +" is running...");
        System.out.println("Speed: "+ SPD);
  }
       
  void attack (String a){
  System.out.println(name +" is Attacking..."+ a);
        System.out.println("ATk: "+ Damage);

  }
  void Defend (String b){
  System.out.println(name +" is Attacked..." +b);
        System.out.println("DEF: "+ Armor);

  }


boolean isDead(){
        if(HP <= 0) return true;
        return false;
    }
    
}