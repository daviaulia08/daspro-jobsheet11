public class pengunjungCafe08 {
    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar nama pengunjung: ");
        for (String x : namaPengunjung) {
            System.out.println("- " + x);
        }
    }

    public static void main(String[] args) {
        daftarPengunjung("Andi", "Budi", "Citra");
    }
}