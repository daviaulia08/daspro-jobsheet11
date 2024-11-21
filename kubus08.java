import java.util.Scanner;

public class kubus08 {
    public static int hitungVolume (int s){
        int volume = s * s * s;
        return volume;
    }
    public static int hitungLuasPermukaan (int s) {
        int luasPermukaan = 6 * s * s;
        return luasPermukaan;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int s;

        System.out.print("Masukkan panjang sisi kubus : ");
        s = input.nextInt();

        int vol = hitungVolume(s);
        System.out.println("Volume kubus adalah : " + vol);
        int lP = hitungLuasPermukaan(s);
        System.out.println("Luas permukaan kubus adalah : " + lP);
    }
}