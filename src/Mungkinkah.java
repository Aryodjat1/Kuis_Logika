import java.util.Scanner;

public class Mungkinkah {

    public void proses() {
        Scanner scan = new Scanner(System.in);

        int data, k, n;


        System.out.println("Nilai k : ");
        k = scan.nextInt();

        System.out.println("Jumlah Angka yang ingin anda masukkan : ");
        data = scan.nextInt();

        System.out.println("--------------------------------------------");

        Integer[] angka = new Integer[data];

        for (int i = 0; i < angka.length; i++) {
            System.out.println("Masukkan Angka ke-" + (i + 1) + " : ");
            angka[i] = scan.nextInt();
        }
    }

    public void apakahMungkin(){

    }

    public static void main(String[] args) {

    }
}

