public class Clock{
    private int hour;
    private int minute;
    private int second;
    private int allSeconds;
    
    public Clock(int totalSeconds){
        allSeconds=totalSeconds;
        hour=totalseconds/3600;
        minute=(totalseconds%3600)/60;
        second=((totalseconds%3600)%60);
    }
    public Clock(int h,int m,int s){
        hour=h;
        minute=m;
        second=s;
    }
    secondsTo(int h,int m,int s){
        int futureH=h*3600;
        int futureM=m*60;
        int futureS=s;
    }
    timeTo(int totalSeconds){
        hour=totalseconds/3600;
        minute=(totalseconds%3600)/60;
        second=((totalseconds%3600)%60);

    }
}