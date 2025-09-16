import java.util.Scanner;
class If3{
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("\n first number?:");
        int first=scan1.nextInt();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("\n second number?:");
        int second=scan2.nextInt();
        Scanner scan3 = new Scanner(System.in);
        System.out.println("\n third number?:");
        int third=scan3.nextInt();
        Scanner scan4 = new Scanner(System.in);
        System.out.println("\n fourth number?:");
        int fourth=scan4.nextInt();

        int[] userNumbers={first,second,third,fourth};
        int[] sortedNumbers={0,0,0,0};
        int greater=0;

        for (int j=0;j<sortedNumbers.length;j++) {
            greater=0;
            for (int i=0;i<userNumbers.length;i++) {
                //System.out.println("i "+i);
                if(userNumbers[i]>greater){
                    greater=userNumbers[i];
                }
            }
            for (int i=0;i<userNumbers.length; i++) {
                //bug where number repeated gets deleted (solved)
                if(greater==userNumbers[i]){
                    userNumbers[i]=0;
                    i=userNumbers.length;
                }                
            }
            sortedNumbers[j]=greater;
        }

System.out.println("SORTED:"+sortedNumbers[0]+", "+sortedNumbers[1]+", "+sortedNumbers[2]+", "+sortedNumbers[3]);
    
    }
}