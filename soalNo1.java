import java.util.Scanner;

public class soalNo1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Harga barang:");
        int hargaBarang=input.nextInt();
        System.out.print("Jumlah barang yang mau dibeli:");
        int jumlahBarang=input.nextInt();

        int totalHarga=hargaBarang*jumlahBarang;

        if(jumlahBarang<5){

        }else if(jumlahBarang>=5 && jumlahBarang<=10){
            totalHarga -=totalHarga*5/100;
        }else if(jumlahBarang>=11 && jumlahBarang<=20){
            totalHarga -=totalHarga*10/100;
        }else{
            totalHarga -=totalHarga*20/100;
        }

        System.out.println("Total harga yang harus dibayar: RP."+totalHarga);
    }
}