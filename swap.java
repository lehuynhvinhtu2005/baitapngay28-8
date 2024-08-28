package baitaptrentruong;
import java.util.Arrays;
public class swap {
    public static void main(String[] args) {
        int[] number = {11, 42, -5, 27, 0, 89};
        for(int i=0; i<number.length/2; i++){
            int temp = number[i];
            number[i] = number[number.length - 1 - i];
            number[number.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(number));
    }
}
