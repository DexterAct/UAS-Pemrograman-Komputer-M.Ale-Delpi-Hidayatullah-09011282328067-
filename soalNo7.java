import java.util.Scanner;

class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean dipinjam;

    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam;
    }

    public void tampilInfoBuku() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Status: " + (dipinjam ? "Dipinjam" : "Tersedia"));
    }

    public void meminjamBuku() {
        if (!dipinjam) {
            dipinjam = true;
            System.out.println("Buku " + judul + " berhasil dipinjam.");
        } else {
            System.out.println("Buku " + judul + " sudah dipinjam.");
        }
    }
}

public class soalNo7 {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Maha Mati", "Djarot Kuntowo", 1972);
        Buku buku2 = new Buku("Dendam Tak Berujung", "Bram Stoker", 1897);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Buku yang tersedia:");
        buku1.tampilInfoBuku();
        buku2.tampilInfoBuku();

        System.out.println("\nMasukkan judul buku yang ingin dipinjam:");
        String judulBuku = scanner.nextLine();

        if (judulBuku.equalsIgnoreCase(buku1.getJudul())) {
            buku1.meminjamBuku();
        } else if (judulBuku.equalsIgnoreCase(buku2.getJudul())) {
            buku2.meminjamBuku();
        } else {
            System.out.println("Buku dengan judul '" + judulBuku + "' tidak ditemukan.");
        }

        scanner.close();
    }
}