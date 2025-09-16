import java.util.Scanner;

class If1{
public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("What is your age?");
    int age=scan.nextInt();
    System.out.println("\n so youre:"+age+" years old...");
    if(age>65){
    System.out.println("Senior citizen");
    }else if(age>=20){
        System.out.println("Adult");
    }else if(age>=13){
        System.out.println("Teen-ager");
    }else if(age>=0){
        System.out.println("haha CHILD");
    }else if(age<0){
        System.out.println("yet to be born...");
    }else{
        System.out.println("not a number then???");
    }

}
}