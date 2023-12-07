import java.util.Scanner;

public class soalNo3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan suku ke-n:");
        int n=input.nextInt();
        input.close();

        long[] fibonacci=new long[n];
        fibonacci[0]=0;
        fibonacci[1]=1;

        for(int i=2;i<n;i++){
            fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
        }

        System.out.println("Deret fobunacci hingga suku ke-"+n+" adalah:");
        for(int i=0;i<n;i++){
            System.out.println(fibonacci[i]+" ");
        }
    }
}
