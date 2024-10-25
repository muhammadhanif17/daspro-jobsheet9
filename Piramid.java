import java.util.Scanner;

public class Piramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, bintang, spasi;
        System.out.print("Masukkan baris piramida: ");
        baris = sc.nextInt();

        bintang = 1;
        spasi = baris - 1;
        
        for (int i = 1; i <= baris ; i++) {
            for (int j = 1; j <= (baris * 2) - 1; j++) {
                if (j > spasi && j <= spasi + bintang) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            spasi--;
            bintang += 2;
        }
    }
}
