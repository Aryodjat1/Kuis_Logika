import java.util.Scanner;

public class JumlahAngka {

    int a;

    public void proses(int a){

            int hasil = 0;

        for (int i = 1; i <= a; i++){
            hasil += i;
            if (i==a){
                System.out.print(i);
            }else {
                System.out.print(i + " + ");
            }
        }
        System.out.println(" = "+hasil);
    }

    public static void main(String[] args) {
        JumlahAngka hitung = new JumlahAngka();

        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan Angka : ");
        hitung.a = scan.nextInt();

        hitung.proses(hitung.a);
    }
}
