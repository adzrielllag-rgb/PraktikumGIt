import java.util.Scanner;
public class Modifikasipercobaan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("---Cetak KRS SIAKAD---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = input.nextBoolean();

        if(uktLunas) {
          System.out.println("Pembayaran UKT Terverifikasi");
          System.out.print("Silakan Cetak KRS dan Tanda Tangan DPA");
          } else {
          System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");

           input.close(); 
          }
    } 
}
  
