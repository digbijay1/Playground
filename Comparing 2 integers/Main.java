import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner scan=new Scanner(System.in);
      int x=scan.nextInt();
      int y=scan.nextInt();
      if(x>y){
        System.out.println(x+" greater than "+y );
    }
     else if(x<y){
        System.out.println(x+" less than "+y );
}
      else{
                System.out.println(x+" and "+y+" are equal " );

      }
    }
}