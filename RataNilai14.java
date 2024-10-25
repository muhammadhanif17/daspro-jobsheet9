import java.util.Scanner;

public class RataNilai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Deklarasi variabel
        int i, j, n;
        float nilai, totalNilai, rataNilai;

        System.out.print("Masukkan jumlah mahasiswa: ");
        n = sc.nextInt();

        i = 1;
        while (i <= n) {
            totalNilai = 0;
            System.out.println("Input nilai mahasiswa ke " + i);
            for ( j = 1; j <= 6; j++) {
                System.out.print("Nilai ke " + j + ": ");
                nilai = sc.nextFloat();
                totalNilai += nilai;
            }
            rataNilai = totalNilai / 5;
            System.out.println("Rata-rata nilai mahasiswa ke " + i + " adalah " + rataNilai);
            i++;
        }
    }
}
