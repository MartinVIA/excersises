class Fibonacci{
    public static void main(String[] args) {
        System.out.println("Fibonacci secuence begins");
        for (int l,j=1,k=0,i=0;i<=20;i++){
            l=j+k;
            j=k;
            k=l;
            System.out.println("("+i+") ="+l);
        }
    }
}