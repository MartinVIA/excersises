
import java.util.Scanner;

class pipipipi{
    public static void main(String[] args) {
        double pi=0;
        double increasing=1;
        int iterations=5;
        double res=0;
        double divisor=1;
        Scanner scan=new Scanner(System.in);
        iterations=scan.nextInt();

        for (int i=0;i<iterations;i++) {
            // System.out.println(res);
            res=res+(divisor/increasing);
            // System.out.println(divisor+"/"+increasing);
            divisor=divisor*-1;
            increasing=increasing+2;
        }
        pi=4*res;
        System.out.println("pi is ="+pi);

    }
}