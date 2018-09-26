class Athlete {
   public void move() {
      System.out.println("Athlete's are Crazy");
   }
}

class swimmer extends Athlete {
   public void move() {
      System.out.println("swimmer is an athlete");
   }
}
class runner extends Athlete {
   public void move() {
      System.out.println("runner is an athlete");
   }
}

public class pun {

   public static void main(String args[]) {
      Athlete a = new Athlete();   
      Athlete b = new swimmer();  
      Athlete c = new runner(); 

      a.move();   
      b.move();  
      c.move();
   }
}
