import java.util.Scanner;
public class NestedUjianSkripsi01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Apakah mahasiswa sudah bebas kompensasi? (true/false)");
    String bebasKompensasi = sc.nextLine();
    
    System.out.println("masukan jumlah log bimbingan pembimbing 1 :");
    int BImbinganP1 = sc.nextInt();
    System.out.println("masukan jumlah  log bimbingan pembimbing 2 :");
    int BimbinganP2 = sc.nextInt();
    String pesan="";

        if (bebasKompensasi == "true") {
          if (BImbinganP1 >= 8 && BimbinganP2 >= 4) {
            pesan = "semua syarat terpenuhi, mahasiswa boleh mendaftar skripsi";
          } else if (BImbinganP1 < 8 && BimbinganP2 >= 4) {
            pesan = "Gagal! log bimbingan p1 kurang dari 8 kali dan p2 kurang dari 4 kali";
          } else if (BImbinganP1 < 8) {
            pesan = "Gagal! log bimbingan p1 belum mencapai 8 kali";
          } else {
            pesan = "Gagal! log bimbingan p2 belum mencapai 4 kali";
          }
        } else {
          pesan = "Gagal! Mahasiswa masih memiliki kompensasi";
        }
        System.out.println(pesan);

         
  }
}
