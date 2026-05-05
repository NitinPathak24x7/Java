//Programm to reverse a three digit number 
public class Q5 {
    public static void main (String [] args){

        int x=123;
        int a,b,c;
        c=x%10;
        x=x/10;
        b=x%10;
        a=x/10;
       System.out.println("The reversed number is : "+c+b+a);

    }
}
