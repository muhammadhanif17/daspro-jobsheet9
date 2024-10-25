import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = sc.nextInt();

        for (int iOuter = n; iOuter >= 1; iOuter--) {

            for (int spasi = 1 ; spasi <= n - iOuter; spasi++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= iOuter; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
