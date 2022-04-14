import java.util.Scanner;

public class AngkaYangLebihBesar {

    int a,b;

    public void angka(int a, int b){
        if (a>b){
            System.out.println("Angka yang lebih besar adalah angka : "+a);
        }else{
            System.out.println("Angka yang lebih besar adalah angka : "+b);
        }
    }

    public static void main(String[] args) {
        AngkaYangLebihBesar angka = new AngkaYangLebihBesar();
        Scanner scan = new Scanner(System.in);

        System.out.println("Angka Pertama : ");
        angka.a = scan.nextInt();

        System.out.println("Angka Kedua : ");
        angka.b = scan.nextInt();

        angka.angka(angka.a, angka.b);


    }
}
