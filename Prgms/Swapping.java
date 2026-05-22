// swapping two variables without using any third variable
public class Swapping {
    public static void main (String [] args){

        int a=10,b=30;
        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("The swapped numbers are :" + a+","+b);

    }
}
