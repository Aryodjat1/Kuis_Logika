import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Mungkinkah {

    public void apakahMungkin() {
        int k, n, hasil=0;

        ArrayList<Integer> angka = new ArrayList<Integer>();

        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan nilai k : ");
        k = scan.nextInt();

        System.out.println("Masukkan jumlah nilai dalam array : ");
        n = scan.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("Masukkan data ke-"+(i+1)+" : ");
            angka.add(scan.nextInt());
        }

        for (int a = 0; a < n; a++){
            for (int b = 0; b < n; b++){
                if (angka.get(a) != angka.get(b)){
                    if (angka.get(a) + angka.get(b) == k){
                        hasil++;
                    }
                }
            }
        }

        System.out.print("Angka Yang Anda Masukkan = [");

        for (int c = 0; c < angka.size(); c++){
            if (c == angka.size()-1){
                System.out.print(angka.get(c));
            }else{
                System.out.print(angka.get(c)+", ");
            }
        }
        System.out.println("]");

        System.out.println("Apakah Mungkin ? ");
        if (hasil > 0){
            System.out.println("Mungkin");
        }else {
            System.out.println("Tidak Mungkin");
        }

    }

    public static void main(String[] args) {
        Mungkinkah mungkin = new Mungkinkah();

        mungkin.apakahMungkin();
    }
}

