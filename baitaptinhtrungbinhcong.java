package baitaptrentruong;
import java.util.Scanner;

public class baitaptinhtrungbinhcong {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("So phan tu la: ");
        int n = keyboard.nextInt();
        int[] number = new int[n];
        int sum = 0;
        for(int i=0; i<n; i++){
            System.out.print("Phan tu thu " + (i+1) + " la: ");
            number[i] = keyboard.nextInt();
            sum+= number[i];
        }
        double average = (float) sum/n;
        System.out.printf("Trung binh cong la: %.1f", average);
        }
    }
