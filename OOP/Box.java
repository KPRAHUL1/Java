package OOP;
class Boxdemo {
    int length;
    int breadth;
    int height;
    static int boxCount;

    public Boxdemo(int i, int i1, int i2) {
        length=i;
        breadth=i1;
        height=i2;
        boxCount++;
    }

    void setDim(int l, int b, int h){     //this pointer
     this.length = l;
     this.breadth=b;
     this.height =h;
     boxCount++;
    }
    void Box(){
        length=-1;
        breadth=-1;
        height=-1;
        boxCount++;
    }
    static {
        System.out.println("from the static blog");
        boxCount =0;
    }
    void Box(int l){
        length=breadth=height=1;
        boxCount++;
    }
   int volume(){
        return length*breadth*height;
    }
}
public class Box {

    public static void main(String[] args) {
        Boxdemo blackBox = new Boxdemo(5,4,3);
        System.out.println("before creating box obj");
//        blackBox.setDim(3,4,6);

        Box b1 = new Box();
        Box b2 = new Box();
        Boxdemo woodbox = new Boxdemo(5,4,2);
//        woodbox.length = 10;
//        woodbox.height = 10;
//        woodbox.breadth = 10;
        System.out.println(blackBox.volume());    //invoke the volume using blackbox
        System.out.println(woodbox.volume());
        System.out.println(Boxdemo.boxCount);
    }
}
