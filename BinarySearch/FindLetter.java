package BinarySearch;

public class FindLetter {
    public static void main(String[] args) {
      char[]  letters = {'c','f','j'};
      char target ='c';
        System.out.println(nextGreatestLetter(letters,target));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start =0;
        int end = letters.length-1;
        System.out.println(end);
        while (start<= end){
            int mid = start + (end-start)/2;
            System.out.println(mid);
            if (letters[mid] > target){
                end = mid-1;
            }
            else {
                start= mid+1;
            }
        }
       return letters[start % letters.length];
    }
}
