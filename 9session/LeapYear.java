import java.util.Scanner;

class LeapYear{
    public static void main(String[] args) {
        boolean working=true;
        int leapCount=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("\n \n We are checking leap years here.. \n Input the first year: ");
        int firstYear=scan.nextInt();
        System.out.println("Now gimmie the second year: ");
        int secondYear=scan.nextInt();
        if(firstYear<0||secondYear<1||secondYear<firstYear){
            System.out.println("You failed at counting :( ");
            working=false;
        }

        if(working){
            for(int countingYear=firstYear; countingYear<secondYear;countingYear++){
                if(countingYear%4==0 & countingYear>=1582){
                    leapCount++;
                }
            }
            System.out.println("So there are "+leapCount+" leap years inside your year range!");
        }
    }
}