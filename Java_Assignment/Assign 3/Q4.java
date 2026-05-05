// Program to calculate sum of all digits of a  number (upto 8 decimal places)
public class Q4 {
    public static void main (String [] args){
        int x=12345678;
        int last_digit ,a,b,c,d,e,f,g;
        last_digit = x%10;     //last digit stored 

        x=x/10;
        a=x%10;
        
        x=x/10;
        b=x%10;
        
        x=x/10;
        c=x%10;
        
        x=x/10;
        d=x%10;
        
        x=x/10;
        e=x%10;
        
        x=x/10;
        f=x%10;
        
        x=x/10;
        g=x%10;
        
         System.out.println("the sum of digits is : "+(a+b+c+d+e+f+g+last_digit));
      
    }
}
