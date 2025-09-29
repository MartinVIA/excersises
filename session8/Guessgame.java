import java.util.Random;
 import java.util.Scanner;
class Guessgame{
    public static void main(String[] args) {
        int max=10;
        Random dice=new Random();
        Scanner scan=new Scanner(System.in);
        int randomNumber=dice.nextInt((max+1));
        System.out.println("\n Guess the number from 0 to "+max+" :");
        int user=scan.nextInt();
        scan.close();
        if(user==randomNumber){
            System.out.println("You got it!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }else{
            System.out.println("Womp Womp!!! \n the answer was actually "+randomNumber);
        }
    }
}
