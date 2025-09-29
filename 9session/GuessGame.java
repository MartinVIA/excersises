
import java.util.Random;
import java.util.Scanner;

class GuessGame{
    public static void main(String[] args) {
        Random dice=new Random();
        int guesses=1;
        int randomNumber=(dice.nextInt(1000))+1;
        Scanner scan=new Scanner(System.in);
        boolean guessing=true;
        do { 
            System.out.println("\n \n   ==== Guess number: "+guesses+" ======");
            System.out.println("Guess a random number from 1 to 1000");
            int input=scan.nextInt();

            if(input<1||input>1000){
                System.out.println("Invalid number..");
                guessing=false;
            }

            if(input<randomNumber){
                System.out.println("\n That number is smaller, unfortunately");
            }
            if(input>randomNumber){
                System.out.println("\n That number is larger! pog!");
            }

            if(input==randomNumber){
                System.out.println("CONGRATULATION MAN YOU GOT IT RIGHT WOAH");
                guessing=false;
            }else guesses++;
        } while (guessing);
    System.out.println(" Game over.. number: "+randomNumber);
    }
}