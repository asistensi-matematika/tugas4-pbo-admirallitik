package packageAsistensi5;

public class BangunDatarClass {
    protected String jenis;
    protected int pilihan;

    public int getPilihan() {
        return pilihan;
    }

    public void setPilihan(int pilihan) {
        this.pilihan = pilihan;
    }
    
    public void view() {
        System.out.println("Pilih bangun datar yang diinginkan");
        System.out.println("1. Persegi");
        System.out.println("2. Lingkaran");
        System.out.println("3. Segitiga");
        System.out.print("Masukan pilihan anda\t : ");
 }   
}
////////////////////////////////////////////////////////////////////////////////
class Persegi extends BangunDatarClass {
    protected double sisi;

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    public double Luas(double sisi) {
        return (sisi * sisi);
    }
    
    public double Keliling(double sisi) {
        return (sisi * 4);
    }
    
    @Override
    public void view() {
        System.out.println("Nama bangun datar adalah persegi.");
        System.out.println("Luasnya adalah " +Luas(sisi)+ "cm^2");
        System.out.println("Keliling adalah " +Keliling(sisi)+ "cm");
    }
}
////////////////////////////////////////////////////////////////////////////////
class Lingkaran extends BangunDatarClass {
    protected double jarijari;

    public double getJarijari() {
        return jarijari;
    }

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }
    
    public double Luas(double jarijari) {
        return (jarijari * jarijari * Math.PI);
    }
    
    public double Keliling(double jarijari) {
        return (2 * jarijari * Math.PI);
    }
    
    @Override
    public void view() {
        System.out.println("Nama bangun datar adalah lingkaran.");
        System.out.println("Luasnya adalah " +Luas(jarijari)+ "cm^2");
        System.out.println("Keliling adalah " +Keliling(jarijari)+ "cm");
    }
}
////////////////////////////////////////////////////////////////////////////////
class Segitiga extends BangunDatarClass {
    protected double alas, tinggi;

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    public double Luas(double alas, double tinggi) {
        return (alas * tinggi) / 2;
    }
    @Override
    public void view() {
        System.out.println("Nama bangun datar adalah segitiga.");
        System.out.println("Luas segitiga adalah " +Luas(alas, tinggi));
    }
}
////////////////////////////////////////////////////////////////////////////////
class JenisSegitiga extends Segitiga {
    
    public double SisiMiring(double alas, double tinggi) {
        return Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
    }
    
    public double Keliling(double alas) {
        return alas + alas + alas;
    }
    
    public double Keliling(double alas, double tinggi) {
        return alas + tinggi + SisiMiring(alas, tinggi);
    }
    
    public void view(double alas) {
        System.out.println("Jenis segitiga adalah segitiga sama sisi.");
        System.out.println("Keliling segitiga adalah " +Keliling(alas));
    }
    
     public void view(double alas, double tinggi) {
        System.out.println("Jenis segitiga adalah segitiga siku-siku.");
        System.out.println("Keliling segitiga adalah " +Keliling(alas, tinggi));
    }
}