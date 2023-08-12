import java.util.*;
public class Array {
    public static void update(int marks[], int nonChangable) {
        nonChangable = 5;
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static int getLargest(int num[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i=0; i<num.length; i++){
            if (largest<num[i]){
                largest = num[i];
            }if (smallest>num[i]){
                smallest = num[i];
            }
        }
        System.out.println("Smallest value is:" + smallest);
        return largest;
    }
    public static void main(String args[]) {
        int num[] = {1,9,45,3,37};
        System.out.println("largest value is:" + getLargest(num));
    }

}
