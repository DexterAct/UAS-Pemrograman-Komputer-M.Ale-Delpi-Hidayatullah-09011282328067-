import java.util.Scanner;

public class soalNo6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan kata atau frase:");
        String kata=input.nextLine();
        System.out.println("Apakah kata itu palindrom? "+palindrom(kata));
    }

    public static boolean palindrom(String kata){
        kata=kata.toLowerCase();
        int mulai=0;
        int selesai=kata.length() -1;

        while (mulai<selesai){
            if(kata.charAt(mulai) != kata.charAt(selesai)){
                return false;
            }
            mulai++;
            selesai--;
        }

        return true;
    }
}
