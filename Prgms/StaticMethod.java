class Test{

 int a=2,b=3;
 static int k=5;

 void setA(int x){
    a=x;
 }
 void setB(int y){
    b=y;
 }
 void setC(int z){
    k=z;
 }

}

public class StaticMethod {
    public static void main(String [] args){
        Test t1 = new Test();        
        Test t2 = new Test();
        t1.setA(4);        
        t1.setB(3);        
        t1.setC(5); 

        System.out.println("a="+t1.a+" b="+t1.b);
        System.out.println("a="+t2.a+" b="+t2.b);
        System.out.println("k="+Test.k);

    }
    
}
