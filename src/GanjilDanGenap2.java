import java.util.Scanner;

public class GanjilDanGenap2 {

    public void inputAngka(){

    }

    public void proses(){
        Scanner scan = new Scanner(System.in);

        int data;

        System.out.println("Jumlah Angka yang ingin anda masukkan : ");
        data = scan.nextInt();
        System.out.println("--------------------------------------------");

        int[] angka = new int[data];

        for (int i = 0; i < angka.length; i++){
            System.out.println("Masukkan Angka ke-"+ (i+1) +" : ");
            angka[i] = scan.nextInt();
        }

        System.out.print("[");
        for (int i=0; i < angka.length; i++){
            if (angka[i] % 2 == 0){
                if (i == (angka.length-1)){
                    System.out.print("Genap");
                }else {
                 System.out.print("Genap, ");
                }
            }else{
                if (i == (angka.length - 1)){
                    System.out.print("Ganjil");
                }else {
                    System.out.print("Ganjil, ");
                }
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        GanjilDanGenap2 hitung = new GanjilDanGenap2();

        hitung.proses();
    }
}
