public class tugas2absen08 {
    public static void main(String[] args) {
        String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
        int[][] penjualan = {
                {20, 20, 25, 20, 10, 60, 10},
                {30, 80, 40, 10, 15, 20, 25},
                {5, 9, 20, 25, 10, 5, 45},
                {50, 8, 17, 18, 10, 30, 6},
                {15, 10, 16, 15, 10, 10, 55}
        };

        tampilkanSeluruhData(menu, penjualan);
        System.out.println();
        tampilkanPenjualanTertinggi(menu, penjualan);
        System.out.println();
        tampilkanRataPenjualan(menu, penjualan);
    }

    public static void tampilkanSeluruhData(String[] menu, int[][] penjualan) {
        System.out.println("Data Penjualan Cafe Ibu Mariana");
        System.out.print("Menu ");
        for (int i = 1; i <= 7; i++) {
            System.out.print("Hari ke-" + i + " ");
        }
        System.out.println();

        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + " ");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void tampilkanPenjualanTertinggi(String[] menu, int[][] penjualan) {
        int max = 0, indexMenu = 0;
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan += penjualan[i][j];
            }
            if (totalPenjualan > max) {
                max = totalPenjualan;
                indexMenu = i;
            }
        }
        System.out.println("Menu terlaris adalah: " + menu[indexMenu]);
    }

    public static void tampilkanRataPenjualan(String[] menu, int[][] penjualan) {
        System.out.println("Rata-rata penjualan setiap menu:");
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan += penjualan[i][j];
            }
            double rata = (double) totalPenjualan / 7;
            System.out.println(menu[i] + " : " + rata);
        }
    }
}