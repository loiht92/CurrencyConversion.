import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int RATE = 23000 ;
        System.out.println("Nhap vao USD");
        int USD = scanner.nextInt();

        int VND = USD * RATE ;
        System.out.println("Gia tri VND la : " + VND);

    }
}
