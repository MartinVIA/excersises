import java.util.Scanner;
public class Fallingtext
{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a word");
    String word = scan.nextLine();
    String result = "";
    char c = 'A';
    int x =0;
    while(!word.equals(result))
    {
      while ((int)c != (int)word.charAt(x))
      {
        try {
          Thread.sleep (8);
        } catch (InterruptedException ie) {
          Thread.currentThread().interrupt();
        }
        System.out.print(result);
        System.out.println(c);
        c++;

      }
      result = result+c;
      System.out.println(result);
      c = 'A';
      x++;
      if(x > word.length()){
        break;
      }
    }
  }
}
