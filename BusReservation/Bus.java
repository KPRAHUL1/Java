package BusReservation;

public class Bus {
   private int busNo;
   private boolean ac;
    private int capacity;   //get & set methods
    Bus(int no, boolean ac, int cap){
        this.busNo=no;
        this.ac = ac;
        this.capacity = cap;
    }
   public int getCapacity(){  //accessor method
        return capacity;
    }

    public int getBusNo() {
        return busNo;
    }

    public void setAc(boolean val){
        ac = val;
    }
    public boolean isAc(){
        return ac;
    }
    public  void setCapacity(int cap){  //mutator method
        capacity=cap;
    }
   public void displayBusInfo(){
       System.out.println("Bus No:"+busNo+" AC:"+ac+" Total Capacity: "+ capacity);
   }
}
