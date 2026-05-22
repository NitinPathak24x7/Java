// Program to check if a given character is an alphabet, digit or  some other character
public class q8 {
    public static void main(String [] args){

        char x='a';
        int y=x;
        System.out.println(y);
        if(y>=48){
            if(y<=57)
                System.out.println("The given character is a digit");
            else if(y>=65){
               if(y<=122)
                    System.out.println("The given character is an alphabet");
       
               else
                System.out.println("The given character is some other character");
            }
        }
        else if(y<48)
            System.out.println("The given character is some other character");
    }
}
