package packageAsistensi5;
import java.util.Scanner;

public class BangunDatarMain {
    public static void main(String[] args) {
        int pilihan;
        BangunDatarClass bd = new BangunDatarClass();
        bd.view();
        Scanner input = new Scanner(System.in);
        pilihan = input.nextInt();
        while(pilihan !=1 && pilihan !=2 && pilihan !=3){
            System.out.println("Tidak ada dalam pilihan.");
            bd.view();
            pilihan = input.nextInt();
        }
        
        Persegi p1 = new Persegi();
        Lingkaran l1 = new Lingkaran();
        Segitiga s1 = new Segitiga();
        JenisSegitiga js1 = new JenisSegitiga();
        
        if(pilihan == 1) {
            double s;
            System.out.print("Masukan panjang sisi\t : ");
            s = input.nextDouble();
            p1.setSisi(s);
            p1.view();
        }
        else if(pilihan == 2) {
            double r;
            System.out.print("Masukan jari - jari\t : ");
            r = input.nextDouble();
            l1.setJarijari(r);
            l1.view();
        }
        else{
            int opsi;
            System.out.println("Pilih segitiga yang diinginkan");
            System.out.println("1. Segitiga siku-siku");
            System.out.println("2. Segitiga sama sisi");
            System.out.print("Masukan pilihan anda\t : ");
            opsi = input.nextInt();
            while(opsi != 1 && opsi !=2){
                System.out.println("Tidak ada dalam pilihan.");
                System.out.print("Masukan pilihan anda\t : ");
                opsi = input.nextInt();
            }
            
            if(opsi == 1){
                double a1, t1;
                System.out.print("Masukan panjang alas\t : ");
                a1 = input.nextDouble();
                System.out.print("Masukan panjang tinggi\t : ");
                t1 = input.nextDouble();
                s1.setAlas(a1);
                s1.setTinggi(t1);
                s1.view();
                js1.view(a1, t1);
            }
            else{
                double a2,t2;
                System.out.print("Masukan panjang alas\t : ");
                a2 = input.nextDouble();
                System.out.print("Masukan panjang tinggi\t : ");
                t2 = input.nextDouble();
                s1.setAlas(a2);
                s1.setTinggi(t2);
                s1.view();
                js1.view(a2);
            }
        }       
    }
}
