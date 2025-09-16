public class Q2{
    
    
    public class Guest{
        private String name="null";
        public String getName(){
                return name;
            }

            public Guest(String name){
                name=getName();
            }
        }
            

    
    public class Hotelroom{
        Guest guest=new Guest("Mark");
        
        private int roomNumber;
        private double rent;
        public int getRoomNumber(){
            return roomNumber;
        }
        public double getRent(){
            return rent;
        }
        public String getGuest(){
            return guest.name;
        }
        void setRent(int newRent){
        rent=newRent;
        }
        public boolean isAvailable=true;

        public void checkIn(Guest guest){

        }
        public void checkOut(){
        
        }
        public String toString(){
            if(guest)
        }

    }

    public static void main(String[] args) {



    }
}