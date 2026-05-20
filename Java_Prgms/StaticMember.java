class Static {
  int x=2,y=7;    // instance variables 
  static int a=5;   // static variable
    
}

public class StaticMember {
   public static void main (String [] args){
 Static s1 = new Static();
 Static s2 = new Static();
 

 System.out.println("x="+s1.x+"y="+s1.y);
 System.out.println("x="+s2.x +"y="+s2.y);
 System.out.println("a="+s1.a);
 System.out.println("a="+s2.a);
 System.out.println("a="+Static.a);


  }

}