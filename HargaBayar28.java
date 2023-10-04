import java.util.Scanner;

public class HargaBayar28{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga, jumlah, Halaman;
        double dis, total, bayar, jmlDis, bsrDis;
        String merk;

        System.out.println("Masukan merk buku : ");
        merk=input.next();
        System.out.println("Masukan jumlah halaman buku : ");
        Halaman=input.nextInt();
        System.out.println("Masukan harga barang yang dibeli : ");
        harga=input.nextInt();
        System.out.println("Masukan jumlah baran yang dibeli : ");
        jumlah=input.nextInt();
        System.out.println("Masukan besaran diskon (dalam desimal, contoh : 0.1 untuk 10%)");
        dis=input.nextDouble();

        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;

        System.out.println("Merk Buku : " + merk);
        System.out.println("Jumlah Halaman : " +Halaman );
        System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " +bayar);
    }
}