public class variableArgs {
   static int minValue(int... vals){
        int min = Integer.MAX_VALUE;
        for(int k:vals){
            if (k<min){
                min=k;
            }
        }
        return  min;
    }
    public static void main(String[] args) {
  int m = minValue(5,2,3);
        System.out.println(m);
        int n = minValue(2,4,5,2,42,2);
        System.out.println(n);
    }
}
