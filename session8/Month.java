import java.util.Scanner;
class Month{
    public static void main(String[] args) {
        String[] months={"January","February","Marchuary","Aplriuary","Mayuary","Junuary","Julyuary","Agugustuary","Septembruary","SpookyMonth","Novembruary","Decembruary"};
        Scanner scan=new Scanner(System.in);
        System.out.println("type month number now");
        int user=scan.nextInt();
        System.out.println(months[user]);
    }
}