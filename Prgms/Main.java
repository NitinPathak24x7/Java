class Apple{
    static int x= 5;
}

class Macbook extends Apple{
 
    static int y=6;

}
public class Main{
    public static void main(String [] args){

        Apple iphone = new Apple();
        System.out.println("Value of x is "+Apple.x);
        System.out.println("Value of y is "+Macbook.x);
        
       }
}


