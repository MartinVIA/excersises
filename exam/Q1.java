import java.util.Scanner;
class Q1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n Type an integer: ");
        int first=scan.nextInt();
        System.out.println("\n Type a second integer: ");
        int second=scan.nextInt();
        System.out.println("\n Type a third integer: ");
        int third=scan.nextInt();
        System.out.println("\n Type a fourth integer: ");
        int fourth=scan.nextInt();
        Scanner scanName= new Scanner(System.in);
        System.out.println("\n Type your name: ");
        String userName=scanName.nextLine();
        System.out.println("Hello "+userName+", Here are the results of the calculations: \n");
        int a=(first+second);
        int b=(second*fourth);
        int c=(third-fourth);
        double thirdD=third;
        double firstD=first;
        double d=(thirdD/firstD);
        double e=(a+b+c+d);
        System.out.println("The sum of ("+first+" + "+second+") is "+a);
        System.out.println("The producs of ("+second+" * "+fourth+") is "+b);
        System.out.println("The difference of ("+third+" - "+fourth+") is "+c);
        System.out.println("The quotient of ("+third+" / "+first+") is "+d);
        System.out.println("The total sum is "+e);
    }
}