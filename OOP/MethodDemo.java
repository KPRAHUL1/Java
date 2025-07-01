package OOP;

public class MethodDemo {

  static int  boxVolume(int length, int height, int breadth){
        int vol = length*breadth*height;
        return vol;
    }
    public static void main(String[] args) {

        System.out.println(boxVolume(3,4,5));
        System.out.println(boxVolume(5,6,6));
    }
}
