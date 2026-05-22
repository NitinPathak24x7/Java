class Box{
  int length;
  int breadth;
  int height;

  void setDimension(int x,int y,int z){
   length = x;
   breadth = y;
   height = z;
  }
  void showDimension(){
    System.out.println("l="+length);
    System.out.println("b="+breadth);
    System.out.println("h="+height);

    
  }
}
public class InstanceMember {
    public static void main (String [] args){

      Box b1= new Box();

      b1.setDimension(30,40,50);
      b1.showDimension();
    }
  }

