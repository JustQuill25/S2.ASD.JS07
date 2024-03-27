package minggu7;

public class PencarianMhs01 {

  Mahasiswa01[] listMhs;
  int idx;
  int left;
  int right;

  public PencarianMhs01(int n) {
    listMhs = new Mahasiswa01[n];
  }

  void tambah(Mahasiswa01 m) {
    if (idx < listMhs.length) {
      listMhs[idx] = m;
      idx++;
    } else {
      System.out.println("Data sudah penuh !! ");
    }
  }

  void tampil() {
    for (Mahasiswa01 m : listMhs) {
      System.out.println(m);
    }
  }

  public int FindBinarySearch(String nama, int left, int right) {
    int mid;
    if (right >= left) {
      mid = (left + right) / 2;
      if (nama.compareTo(listMhs[mid].getNama()) == 0) {
        return mid;
      } else if (nama.compareTo(listMhs[mid].getNama()) < 0) {
        return FindBinarySearch(nama, left, mid - 1);
      } else {
        return FindBinarySearch(nama, mid + 1, right);
      }
    }
    return -1;
  }

  public void TampilPosisi(String nama, int pos) {
    if (pos != -1) {
      System.out.println("Data " + nama + " ditemukan pada indeks " + pos);
      int idxAwal = pos;
      int idxAkhir = pos;

      while (idxAwal > 0 && listMhs[idxAwal - 1].getNama().compareTo(nama) == 0) {
        idxAwal--;
      }
      while (idxAkhir < listMhs.length - 1 && listMhs[idxAkhir + 1].getNama().compareTo(nama) == 0) {
        idxAkhir++;
      }

      if (idxAkhir - idxAwal > 0) {
        System.out.println("Peringatan: Terdapat " + (idxAkhir - idxAwal + 1) + " data dengan nama " + nama);
      }

      for (int i = idxAwal; i <= idxAkhir; i++) {
        System.out.println(listMhs[i]);
      }
    } else {
      System.out.println("Data " + nama + " tidak ditemukan");
    }
  }
}
