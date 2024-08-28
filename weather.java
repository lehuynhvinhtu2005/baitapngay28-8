package baitaptrentruong;

import java.util.Scanner;

public class weather {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Nhiet do cua bao nhieu ngay: ");
        int days = console.nextInt();
        int[] temps = new int[days];
        int sum = 0;
        for (int i = 0; i < days; i++) {
            System.out.println("Nhiet do cao " + (i + 1) + " cua ngay la: ");
            temps[i] = console.nextInt();
            sum += temps[i];
        }
        double average = (double) sum / days;
        int count = 0;
        for (int i = 0; i < days; i++) {
            if (temps[i] > average) {
                count++;
            }
        }
        System.out.printf("Nhiet do trung binh la = %.1f", average);
        System.out.println();
        System.out.println(count + " ngay co nhiet do tren trung binh");
    }
}//alt + shift + F
//%.1f lay 1 chu so sau dau thap phan
