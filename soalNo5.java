import java.util.Scanner;

public class soalNo5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan angka pertama:");
        double angka1=input.nextDouble();
        System.out.print("Masukkan angka kedua:");
        double angka2=input.nextDouble();

        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Masukkan nomor operasi:");
        int pilih=input.nextInt();

        switch(pilih){
            case 1:
            System.out.println("Hasil penjumlahan: "+penjumlahan(angka1, angka2));
            break;
            case 2:
            System.out.println("Hasil pengurangan: "+pengurangan(angka1, angka2));
            break;
            case 3:
            System.out.println("Hasil perkalian: "+perkalian(angka1, angka2));
            break;
            case 4:
            System.out.println("Hasil pembagian: "+pembagian(angka1, angka2));
            break;
            default:
            System.out.println("error");
        }
        input.close();
    }

    public static double penjumlahan(double angka1, double angka2){
        return angka1+angka2;
    }

    public static double pengurangan(double angka1, double angka2){
        return angka1-angka2;
    }

    public static double perkalian(double angka1, double angka2){
        return angka1*angka2;
    }

    public static double pembagian(double angka1, double angka2){
        if (angka2==0){
            throw new IllegalArgumentException("Tidak dapat membagi dengan nol.");
        }
        return angka1/angka2;
    }
}
