package OOP;
class Boxdemo {
    int length;
    int breadth;
    int height;
   int volume(){
        return length*breadth*height;
    }
}
public class Box {
    public static void main(String[] args) {
        Boxdemo blackBox = new Boxdemo();
        blackBox.length = 10;
        blackBox.breadth = 8;
        blackBox.height = 8;

        Boxdemo woodbox = new Boxdemo();
        woodbox.length = 10;
        woodbox.height = 10;
        woodbox.breadth = 10;
        System.out.println(blackBox.volume());    //invoke the volume using blackbox
        System.out.println(woodbox.volume());
    }
}
