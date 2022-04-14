import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class NilaiMax {

    public void proses(){
        Scanner scan = new Scanner(System.in);

        int data;

        System.out.println("Jumlah Angka yang ingin anda masukkan : ");
        data = scan.nextInt();
        System.out.println("--------------------------------------------");

        Integer[] angka = new Integer[data];

        for (int i = 0; i < angka.length; i++){
            System.out.println("Masukkan Angka ke-"+ (i+1) +" : ");
            angka[i] = scan.nextInt();
        }
        Arrays.sort(angka, Collections.reverseOrder());
        System.out.println(angka[0]);
    }

    public static void main(String[] args) {
        NilaiMax max = new NilaiMax();
        max.proses();
    }
}
