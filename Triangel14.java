import java.util.Scanner;

public class Triangel14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = sc.nextInt();
        int i = 1;
        while (i < n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
        System.out.println();    
        i++;
        }
    }
}
