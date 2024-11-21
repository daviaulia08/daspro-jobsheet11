import java.util.Scanner;

public class hitungTotalHarga08 {

    public static double hitungTotalHarga(int[] pilihanMenu, int[] banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        double totalHarga = 0;

        for (int i = 0; i < pilihanMenu.length; i++) {
            int indexMenu = pilihanMenu[i] - 1; 
            totalHarga += hargaItems[indexMenu] * banyakItem[i];
        }

        double diskon = 0;

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Anda mendapat diskon sebesar 50%!");
            diskon = 0.50;
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Anda mendapat diskon sebesar 30%!");
            diskon = 0.30;
        } else {
            System.out.println("Maaf, kode promo Anda tidak valid.");
        }

        double hargaDiskon = totalHarga - (totalHarga * diskon);
        return hargaDiskon; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu yang ingin Anda pesan: ");
        int jumlahMenu = sc.nextInt();

        int[] pilihanMenu = new int[jumlahMenu];
        int[] banyakItem = new int[jumlahMenu];

        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("\nMasukkan menu yang ingin Anda pesan : ");
            pilihanMenu[i] = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            banyakItem[i] = sc.nextInt();
        }

        sc.nextLine(); 
        System.out.print("\nMasukkan kode promo: ");
        String kodePromo = sc.nextLine();

        double totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);

        System.out.println("\nTotal yang harus dibayar adalah : Rp " + totalHarga);
    }
}
