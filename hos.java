class Hospital {
   public void patient() {
      System.out.println("Good hospitals are");
   }
}

class Appolo extends Hospital {
   public void patient() {
      System.out.println("appolo has 500 patients");
   }
}
class Manipal extends Hospital {
   public void patient() {
      System.out.println("Manipal has 1000 patients");
   }
}
class Baptist extends Hospital {
   public void patient() {
      System.out.println("Baptist has 700 patients");
   }
}


public class hos {

   public static void main(String args[]) {
      Hospital d = new Hospital();
      Hospital a = new Appolo();   
      Hospital b = new Manipal();  
      Hospital c = new Baptist(); 
      
      d.patient();
      a.patient();   
      b.patient();  
      c.patient();
   }
}
