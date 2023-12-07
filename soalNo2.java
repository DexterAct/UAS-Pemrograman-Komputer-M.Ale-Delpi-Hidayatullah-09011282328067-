import java.util.Scanner;

public class soalNo2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Username:");
        String username=input.nextLine();
        System.out.print("Password:");
        String password=input.nextLine();
        input.close();

        if (username.equals("user") && password.equals("abc123")){
            System.out.println("Username dan Password benar");
        }else{
            System.out.println("Username dan Password salah");
        }
    }
}
