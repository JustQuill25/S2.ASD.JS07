package minggu7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MahasiswaMain01 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Scanner sl = new Scanner(System.in);

    System.out.print("Masukkan jumlah mahasiswa: ");
    int jumMhs = s.nextInt();

    PencarianMhs01 data = new PencarianMhs01(jumMhs);

    for (int i = 0; i < jumMhs; i++) {
      System.out.println("====================");
      System.out.print("Nama\t : ");
      String nama = sl.nextLine();
      System.out.print("Nim\t : ");
      int nim = s.nextInt();
      System.out.print("IPK\t : ");
      double ipk = s.nextDouble();

      Mahasiswa01 m = new Mahasiswa01(nama, nim, ipk);
      data.tambah(m);
    }

    Arrays.sort(data.listMhs, new Comparator<Mahasiswa01>() {
      @Override
      public int compare(Mahasiswa01 o1, Mahasiswa01 o2) {
        return o1.getNama().compareTo(o2.getNama());
      }
    });

    System.out.println("Data Keseluruhan Mahasiswa : ");
    data.tampil();

    System.out.println("================================");
    System.out.println("Pencarian Data : ");
    System.out.print("Masukkan nama yang ingin dicari: ");
    String nama = sl.nextLine();

    int posisi = data.FindBinarySearch(nama, 0, data.listMhs.length - 1);
    data.TampilPosisi(nama, posisi);
  }
}
