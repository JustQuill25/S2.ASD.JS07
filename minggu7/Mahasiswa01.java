package minggu7;

public class Mahasiswa01 {

  private String nama;
  private int nim;
  private double ipk;

  public Mahasiswa01(String nama, int nim, double ipk) {
      this.nama = nama;
      this.nim = nim;
      this.ipk = ipk;
  }

  public String getNama() {
      return nama;
  }

  public void setNama(String nama) {
      this.nama = nama;
  }

  public int getNim() {
      return nim;
  }

  public void setNim(int nim) {
      this.nim = nim;
  }

  public double getIpk() {
      return ipk;
  }

  public void setIpk(double ipk) {
      this.ipk = ipk;
  }

  @Override
  public String toString() {
      return "Mahasiswa{" +
              "nama='" + nama + '\'' +
              ", nim=" + nim +
              ", ipk=" + ipk +
              '}';
  }
}
