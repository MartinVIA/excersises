
import java.util.Scanner;

class Randomizing{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("hehe");
        String input="";
        boolean[] bagPieceUsed={false,false,false,false,false,false,false};
        String[] pieces={"I","O","T","L","J","S","Z"};
        
        while(input.equals("")){
            input=scan.nextLine();
            int randomIndex = (int)(Math.random() * pieces.length);
            System.out.println("Random Index: "+randomIndex);

            if(bagPieceUsed[0]&bagPieceUsed[1]&bagPieceUsed[2]&bagPieceUsed[3]&bagPieceUsed[4]&bagPieceUsed[5]&bagPieceUsed[6]){
                    System.out.println("BAG IS FULLLLLL AAAAAAAA \n enter to deplete:");
                    for (int k=0;k<bagPieceUsed.length;k++){
                        bagPieceUsed[k]=false;
                    }
                    input=scan.nextLine();
            
            }

            while(bagPieceUsed[randomIndex]){
                int newRandom =(int)(Math.random()*pieces.length);
                System.out.println("repeat.."+newRandom);
                randomIndex=newRandom;
            }
                
                System.out.println(pieces[randomIndex]);
                bagPieceUsed[randomIndex]=true;
                
            
            for (int i=0;i<bagPieceUsed.length;i++){
                if(bagPieceUsed[i]){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
   
        }
    }

}


