import java.util.Scanner;
public class JOBSHEET5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("---Cetak KRS SIAKAD---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = input.nextBoolean();

        if(uktLunas) {
          System.out.println("Pembayaran UKT Terverifikasi");
          System.out.print("Silakan Cetak KRS dan Tanda Tangan DPA");

          input.close();
        }
    } 
}
