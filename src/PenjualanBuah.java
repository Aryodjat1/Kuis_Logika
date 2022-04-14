import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PenjualanBuah {

    public void jualBuah(){
        int value;
        ArrayList<String> buah = new ArrayList<String>();
        ArrayList<Integer> kilo = new ArrayList<Integer>();

        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan jumlah Buah : ");
        value = scan.nextInt();

        for (int i = 0; i < value; i++){
            System.out.println("Nama Buah ke-"+(i+1)+" : ");
            buah.add(scan.next());

            System.out.println("Berat ke-"+(i+1)+" : ");
            kilo.add(scan.nextInt());
        }

        Object laris= Collections.max(kilo);
        int idKilo = kilo.indexOf(laris);
        String buahTerlaris = buah.get(idKilo);
        System.out.println("Buah Yang Paling Laris = "+ buahTerlaris);
    }

    public static void main(String[] args) {
        PenjualanBuah jualBuah = new PenjualanBuah();

        jualBuah.jualBuah();
    }
}
