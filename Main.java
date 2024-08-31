import java.util.Scanner;
import java.util.ArrayList;

class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    boolean loop = true;
    String again = "";

    while(loop == true)
    {
      System.out.println("Enter a whole number:");
      int num = scan.nextInt();
      int counter = 0;
      ArrayList<Integer> list = new ArrayList<Integer>();
      while(num != 0)
      {
        list.add(num % 2);
        num /= 2;
        counter++;
      }
      for(int i = list.size(); i > 0; i--)
      {
        System.out.print(list.get(i - 1));
      }
      System.out.println("\nThere were " + counter + " iterations for this number.");
      System.out.println("Would you like continue?");
      again = scan.next();
      if(again.equals("no"))
      {
        loop = false;
      }
    }
  }
}