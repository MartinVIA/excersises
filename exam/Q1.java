import java.text.DecimalFormat;
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
        DecimalFormat rounder=new DecimalFormat("0.0000");
        int a=(first+second);
        int b=(second*fourth);
        int c=(third-fourth);
        double d=((double)third/first);
        double e=(a+b+c+d);
        System.out.println("The sum of ("+first+" + "+second+") is "+a);
        System.out.println("The producs of ("+second+" * "+fourth+") is "+b);
        System.out.println("The difference of ("+third+" - "+fourth+") is "+c);
        System.out.println("The quotient of ("+third+" / "+first+") is "+rounder.format(d));
        System.out.println("The total sum is "+rounder.format(e));
    }
}