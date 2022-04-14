import java.util.Scanner;

public class GanjilDanGenap {

    int a;

    public void proses(int a){
        if (a % 2 == 0){
            System.out.println("Angka Yang Anda Masukkan adalah Genap");
        }else {
            System.out.println("Angka Yang Anda Masukkan adalah Ganjil");
        }
    }

    public static void main(String[] args) {
        GanjilDanGenap hitung = new GanjilDanGenap();

        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan Angka : ");
        hitung.a = scan.nextInt();

        hitung.proses(hitung.a);
    }
}
