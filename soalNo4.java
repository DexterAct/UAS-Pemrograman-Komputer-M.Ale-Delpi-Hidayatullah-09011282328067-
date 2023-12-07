import java.util.Scanner;

public class soalNo4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat positif:");
        int angka=input.nextInt();
        input.close();

        System.out.println("Faktorisasi "+angka+": "+faktorisasi(angka));

    }

    public static String faktorisasi(int angka){
        StringBuilder sb=new StringBuilder();
        for(int i=2;i<=angka;i++){
            while(angka%i==0){
            sb.append(i).append(" * ");
            angka /= i;
            }
        }
        return sb.toString().trim();
    }
}
