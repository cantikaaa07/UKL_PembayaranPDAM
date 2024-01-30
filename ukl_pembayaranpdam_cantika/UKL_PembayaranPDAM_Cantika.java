
package ukl_pembayaranpdam_cantika;
import java.util.Scanner;


public class UKL_PembayaranPDAM_Cantika {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nama = {"", "Ali", "Budi", "Dani", "Edi", "Umar"};
        int[] m3 = {10, 20, 30};

        System.out.println("===============================================");
        System.out.println("                PEMBAYARAN PDAM                ");
        System.out.println("===============================================");
        System.out.print("Masukkan ID anda: ");
        int id = input.nextInt();

        if (id < 1 || id > 5) {
            System.out.println("SALAHDONG");
            System.out.println("================================================");
        } else {
            System.out.print("Masukkan pemakaian air anda: ");
            int air = input.nextInt();
            if (air < 0) {
                System.out.println("SALAHDONG");
                System.out.println("================================================");
            } else {
                int biaya = hitung(m3, air);
                System.out.println("================================================");
                System.out.println("ID Pelanggan\t: " + id);
                System.out.println("Nama Pelanggan\t: " + nama[id]);
                System.out.println("Jumlah Tagihan\t: " + biaya);
                System.out.println("================================================");

            }
        }
    }

    public static int hitung(int[] m3, int air) {
        int biaya = 0;
        int tarif = 0;

        if (air > 30) {
            tarif = 5000;
        } else if (air > 20) {
            tarif = 4000;
        } else if (air > 10) {
            tarif = 3000;
        } else {
            tarif = 2000;
        }
        biaya = tarif * air + 10000;

        if (air < 10) {
            air = 10;
        }
        return biaya;
    }
    }
    

