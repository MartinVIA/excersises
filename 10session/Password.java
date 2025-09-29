import java.util.Scanner;

class Password{
public static void main(String[] args) {
    boolean passed=false,space=false,lonng=false;
    int n=0,u=0,l=0;
    while(!passed){
        Scanner scan=new Scanner(System.in);
        System.out.println("\n == Insert password ==");
        String pass1=scan.nextLine();
        System.out.println(" == Veryfy password ==");
        String pass2=scan.nextLine();

        if(pass1.equals(pass2)){
            for (int i=0; i<pass1.length();i++) {
                if(Character.isDigit(pass1.charAt(i))){
                    n++;}
                if(Character.isUpperCase(pass1.charAt(i))){
                    u++;}
                if(Character.isLowerCase(pass1.charAt(i))){
                    l++;}
                if(Character.isWhitespace(pass1.charAt(i)))
                space=true;
                if(i>8){
                    lonng=true;
                }
            }
            if(n<1){
                System.out.println("not enough numbers used");
            }else if(u<2){
                System.out.println("Not enough uppercase letters used");
            }else if(l<5){
                System.out.println("You need more lowecase letters, womp womp");
            }else if(!lonng){
                System.out.println("You could try a longer password honestly...");
            }else{
                passed=true;
            }
            
            if(space){
                System.out.println("\n You shouldnt put spaces there but eh idk");
            }

        }else{
            System.out.println("Passwords dont match");
        }
    }
    System.out.println("over");
}
}