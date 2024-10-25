import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Deklarasi variabel
        int jnisOlahraga = 0 , i = 1;
        String nama;
       
        while (i <= 4) {
            jnisOlahraga += 1;
            if (jnisOlahraga == 1) {
                System.out.println("Input nama atlet Badminton");
            }else if (jnisOlahraga == 2) {
                System.out.println("Input nama atlet Tenis Meja");
            }else if (jnisOlahraga == 3) {
                System.out.println("Input nama atlet Voli");
            }else if (jnisOlahraga == 4) {
                System.out.println("Input nama atlet Basket");
            }
            for (int j = 1; j <= 5; j++) {
                System.out.print("Masukkan nama atlet ke " + j + ": ");
                nama = sc.nextLine();
            }
            System.out.println("");
            i++;
        }
    }
}
