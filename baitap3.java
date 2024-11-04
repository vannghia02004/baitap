package main.java.com.mycompany.baitap;

public class baitap3 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (kiemtra(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean kiemtra(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}