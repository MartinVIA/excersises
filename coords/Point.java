public class Point{
    int x;
    int y;
    void getX(){
        System.out.println(x);
    }
    void getY(){
        System.out.println(y);
    }
    public void setX(int newX){
        x=newX;
    }
    public void setY(int newY){
        y=newY;
    }

    public Point(){
        x=2;
        y=2;
    }

    public void moveTo(int nextX, int nextY){
        setX(nextX);
        setY(nextY);
    }
   
    public void move(int nextX, int nextY){
        setX(x+nextX);
        setY(y+nextY);
    }
    public static void main(String args[]){
        Point p1=new Point();
 
        System.out.println("\n \n get");
        p1.getX();
        p1.getY();

int[][] table={
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0}
        };        
        table[(p1.y-1)][(p1.x-1)]=1;
        for(int i=0;i<table.length;i=i+1){
            System.out.print("|  ");
            for(int j=0;j<table[i].length;j=j+1){
                System.out.print(table[i][j]);
                System.out.print(" ");
            }
            System.out.println(" |");
        }

        
        p1.move(5,7);
        System.out.println("\n \n set in x=5 and y=8");
        p1.getX();
        p1.getY();
        
int[][] tablet={
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0}
        };        
        tablet[(p1.y-1)][(p1.x-1)]=1;
        for(int i=0;i<tablet.length;i=i+1){
            System.out.print("|  ");
            for(int j=0;j<tablet[i].length;j=j+1){
                System.out.print(tablet[i][j]);
                System.out.print(" ");
            }
            System.out.println(" |");
        }
    }
}
