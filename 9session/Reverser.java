import java.util.Scanner;
class Reverser{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("\n Gimmie your word and ill mirror it!");
        String input=scan.nextLine();
        for(int i=input.length();i>0;i--){
            System.out.print(input.charAt(i-1));
        }
    }
}