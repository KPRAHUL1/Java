public class pattern {
    public  static  void main(String[] args) {
//        for (int i=1;i<=5;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print('*');
//            }
//            System.out.print("\n");
//        }
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i);
//            }
//            System.out.print("\n");
//        }
//        for (int i = 1; i <= 5; i++) {
//           for (int j = 1; j <= i; j++) {
//               System.out.print(j);
//           }
//           System.out.print("\n");
//       }
//        int num=1;
//        for (int i = 0; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//              System.out.print(num);
//              num++;
//            }
//            System.out.print("\n");
//        }
//        for (int i = 5; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//               System.out.print(j);
//           }
//            System.out.print("\n");
//        }

        for(int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if ( (i==2 && j==2) || (i==3 && j==4) || (i==4 && j==2)){
                    break;
                }
                System.out.print('*');
            }
            System.out.print("\n");
        }

    }
}
