import java.util.Scanner;

public class hitungTotalHarga08 {
    public static void hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        double hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        double diskon, hargaDiskon;

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Selamat anda mendapat diskon sebesar 50% !");
            diskon = 0.50;
            hargaDiskon = hargaTotal - (hargaTotal*diskon);
            System.out.println("Total harga yang harus dibayar adalah : Rp " + hargaDiskon);
        }
        else if (kodePromo.equals("DISKON30")) {
            System.out.println("Selamat anda mendapat diskon sebesar 30% !");
            diskon = 0.30;
            hargaDiskon = hargaTotal - (hargaTotal*diskon);
            System.out.println("Total harga yang harus dibayar adalah : Rp " + hargaDiskon);
        }
        else {
            System.out.println("Maaf, kode promo anda tidak valid");
            diskon = 0;
            hargaDiskon = hargaTotal - (hargaTotal*diskon);
            System.out.println("Total harga yang harus dibayar adalah : Rp " + hargaDiskon);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nMasukkan nomor menu yang ingin anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan kode promo: ");
        String kodePromo = sc.nextLine();

        hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
    }
}