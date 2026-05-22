// Program to check whether given number is three digit or not 
public class q9 {
 public static void main(String [] args){
    int x=1111;
    int y=x/100;
    if(y>=1)
        if(y<=9.9)
            System.out.println("The given number number is three digit number");
    
    else
        System.out.println("The given number is not a three digit number");
 }   
}
