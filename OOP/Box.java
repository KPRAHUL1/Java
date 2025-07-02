package OOP;
class Boxdemo {
    int length;
    int breadth;
    int height;

    public Boxdemo(int i, int i1, int i2) {
        length=i;
        breadth=i1;
        height=i2;
    }

    void setDim(int l, int b, int h){     //this pointer
     this.length = l;
     this.breadth=b;
     this.height =h;
    }
   int volume(){
        return length*breadth*height;
    }
}
public class Box {
    public static void main(String[] args) {
        Boxdemo blackBox = new Boxdemo(5,4,3);
//        blackBox.setDim(3,4,6);

        Boxdemo woodbox = new Boxdemo(5,4,2);
//        woodbox.length = 10;
//        woodbox.height = 10;
//        woodbox.breadth = 10;
        System.out.println(blackBox.volume());    //invoke the volume using blackbox
        System.out.println(woodbox.volume());
    }
}
