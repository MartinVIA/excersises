import java.util.Scanner;
class If2{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Type in gender and age as \n -- M05 -- \n M(Male) F(Female) N(Non-binary)");
        String user=scan.nextLine();
        Character userGender=user.charAt(0);
        String gender=userGender.toString();
        System.out.println("genda: "+userGender);
        String ageString=user.substring(1);
        int age=Integer.parseInt(ageString);
        System.out.println("age: "+age);

        Boolean old=false;
        if(age>=18){
            old=true;
        }
        if(gender.equalsIgnoreCase("m")&old){
            System.out.println("man...(looks at the horizon)");
        }
        if(gender.equalsIgnoreCase("m")&!old){
            System.out.println("listen here kid, youre just a boy so stfu bruh");
        }
        if(gender.equalsIgnoreCase("f")&old){
            System.out.println("greetings lady, ur a women");
        }
        if(gender.equalsIgnoreCase("f")&!old){
            System.out.println("gurl exists here");
        }
        if(gender.equalsIgnoreCase("n")&old){
            System.out.println("Old person identified!");
        }
        if(gender.equalsIgnoreCase("n")&!old){
            System.out.println("CHILD HAHA");
        }
    }
}