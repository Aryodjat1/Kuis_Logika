import java.util.ArrayList;
import java.util.Scanner;

public class ApakahSemuaBerbeda {

    public void semuaBerbedakah(){
        int n, hasil=0;

        ArrayList<Integer> angka = new ArrayList<Integer>();

        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan jumlah angka : ");
        n = scan.nextInt();

        for (int i = 0; i < n; i++ ){
            System.out.println("Masukkan Angka ke- " + (i+1) + " : ");
            angka.add(scan.nextInt());
        }

        for (int a = 0; a < angka.size(); a++){
            for (int b = a+1; b < angka.size(); b++){
                if (angka.get(a) == angka.get(b)){
                    hasil++;
                }
            }
        }
        if (hasil > 0){
            System.out.println("Ada");
        }else {
            System.out.println("Tidak Ada");
        }
    }

    public static void main(String[] args) {
        ApakahSemuaBerbeda apakah = new ApakahSemuaBerbeda();

        apakah.semuaBerbedakah();
    }
}
