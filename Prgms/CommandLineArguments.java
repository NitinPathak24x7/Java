// Passing command line arguments to the Program using CLI interface 
public class CommandLineArguments{
    public static void main (String [] args){

        System.out.println("First line");
        System.out.println("argument 1 :"+args[0]);
        System.out.println("argument 1 :"+args[1]);
        System.out.println("argument 1 :"+args[2]);

        System.out.println(Integer.parseInt(args[3])+Integer.parseInt(args[4])); // adding two arguments by converting them into int data_type

    }
    
}
